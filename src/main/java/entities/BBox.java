package entities;

public class BBox {
    private int x;
    private int y;
    private int w;
    private int h;
    private double score;

    public BBox(int x, int y, int w, int h, double score) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.score = score;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
