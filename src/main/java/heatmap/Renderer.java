package heatmap;


import Config.AppfileConfig;
import Config.SpringContext;
import com.proto.common.Box;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Renderer {
    static AppfileConfig appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);


    public static BufferedImage renderHeatMap(int width, int height, List<Box> boxes) {
        try {

            HeatMap heatMap = new HeatMap(width, height);
//            mat.release();
            return heatMap.createHeatMap(appfileConfig.multiplier, boxes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new BufferedImage(0, 0, 0);

    }


}
