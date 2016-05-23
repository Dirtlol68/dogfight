package jpu2016.dogfight.model;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Position {

    private double x ;
    private double y ;
    private double maxX ;
    private double maxY ;



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    protected void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    protected void setMaxY(double maxY) {
        this.maxY = maxY;
    }
}
