package heatmap;


import Config.AppfileConfig;
import Config.SpringContext;
import com.proto.common.Box;
import entities.BBox;
import entities.Coordinate;
import entities.Polygon;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HeatMap {
    private static final int HALCIRCLEPICSIZE = 32;
    private static final String SPECTRUMPIC = "colors.png";
    private HashMap<Integer, List<Polygon>> polygonMap;
    private int maxOccurance = 1;
    private int maxXValue;
    private int maxYValue;
    AppfileConfig appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);

    public HeatMap(int width, int height) {
        this.maxXValue = width;
        this.maxYValue = height;

    }


    private HashMap<Integer, List<Box>> initMap(final List<Box> points) {


        HashMap<Integer, List<Box>> map = new HashMap<Integer, List<Box>>();


        final int pointSize = points.size();
        points.forEach(point -> {

            final int hash = getkey(point);
            if (map.containsKey(hash)) {

                List<Box> thisList = map.get(hash);
                thisList.add(point);
                if (thisList.size() > maxOccurance) {
                    maxOccurance = thisList.size();
                }
            } else {
                final List<Box> newList = new LinkedList<Box>();
                newList.add(point);
                map.put(hash, newList);
            }
        });
        return map;
    }

    public BufferedImage createHeatMap(final float multiplier, List<Box> points) {

        HashMap<Integer, List<Box>> map = initMap(points);

        BufferedImage heatMap = new BufferedImage(maxXValue, maxYValue, 6);
        paintInColor(heatMap, Color.white);
//        paintInColor(heatMap,new Color(255,255,255,200));

        final Iterator<List<Box>> iterator = map.values().iterator();

        while (iterator.hasNext()) {
            final List<Box> currentPoints = iterator.next();
            float opaque = currentPoints.size() / (float) maxOccurance;
//            opaque *= multiplier;
//            if (opaque>1){
//                opaque = 1;
//            }
            if (opaque < (1 - multiplier)) {
                opaque = 1 - multiplier;
            }
            Box currentPoint = currentPoints.get(0);

            addImage(heatMap, null, opaque, currentPoint);

        }

        heatMap = negateImage(heatMap);

        remap(heatMap);


//        final BufferedImage output = lvlMap;
//        addImage(output, heatMap, 0.4f);

        return heatMap;
    }

    private void remap(final BufferedImage heatMapBW) {
//        final BufferedImage colorGradiant = loadImage(SPECTRUMPIC);
        final BufferedImage colorGradiant = createPalette();
        final int width = heatMapBW.getWidth();
        final int height = heatMapBW.getHeight();
        final int gradientWidth = colorGradiant.getWidth() - 1;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                final int rGB = heatMapBW.getRGB(i, j);

                float multiplier = rGB & 0xFF;
                multiplier *= ((rGB >>> 8)) & 0xff;
                multiplier *= (rGB >>> 16) & 0xff;

                multiplier /= 16581375;

                final int x = (int) (multiplier * gradientWidth);

                final int mapedRGB = colorGradiant.getRGB(x, 0);

                heatMapBW.setRGB(i, j, mapedRGB);

            }
        }
    }

    private BufferedImage negateImage(BufferedImage img) {
        final int width = img.getWidth();
        final int height = img.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                final int rGB = img.getRGB(i, j);

                final int b = Math.abs((rGB & 0xFF) - 255);
                final int g = Math.abs(((rGB >>> 8) & 0xff) - 255);
                final int r = Math.abs(((rGB >>> 16) & 0xff) - 255);

                img.setRGB(i, j, (r << 16) | (g << 8) | b);

            }
        }


        return img;
    }

    private void paintInColor(final BufferedImage buff, final Color color) {
        final Graphics2D g2 = buff.createGraphics();
        g2.setColor(color);
        g2.fillRect(0, 0, buff.getWidth(), buff.getHeight());
        g2.dispose();
    }


    private void addImage(BufferedImage buff1, BufferedImage buff2, float opaque, Box box) {

        Graphics2D g2d = buff1.createGraphics();
//        if (opaque<0.4){
//            opaque =  0.4f;
//        }
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opaque));
        if (box != null) {

            int radius = Math.max(box.getW() / 2, box.getH() / 2);
            int x = box.getX();
            int y = box.getY();

            short color = (short) (255 * appfileConfig.multiplier);

            g2d.setPaint(new RadialGradientPaint(new Point.Double(x, y), radius, new float[]{0f, 1.0f},
                    new Color[]{new Color(0, 0, 0, color), new Color(0, 0, 0, 0)}));
//            g2d.setPaint(new Color(0,0,0,255));
            g2d.fillArc(x - radius, y - radius, 2 * radius, 2 * radius, 0, 360);
//            System.out.println(x+" "+y);

        } else {
            g2d.drawImage(buff2, 0, 0, null);
            g2d.dispose();
        }


    }

    public BufferedImage createPalette() {
        BufferedImage palette = null;

        palette = new BufferedImage(256, 1, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d = palette.createGraphics();
        g2d.setPaint(new LinearGradientPaint(new Point2D.Float(1, 0), new Point2D.Float(255, 0),
                new float[]{0.001f, 0.10f, 0.25f, 0.55f, 0.85f, 1.0f},
                new Color[]{new Color(54, 52, 61),
                        new Color(0, 0, 255),
                        new Color(0, 255, 255),
                        new Color(0, 255, 0),
                        new Color(255, 255, 0),
                        new Color(255, 0, 0)}));
        g2d.fillRect(0, 0, 256, 1);

        return palette;


    }


    private int getkey(final Box box) {


        int x = box.getX();
        int y = box.getY();
        int coordHash = (x << 19) | (y << 7);
        int sizeHash = (box.getW() << 19) | (box.getH() << 7);
        return (coordHash + sizeHash);


    }


}
