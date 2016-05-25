package jpu2016.dogfight.model;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Position {

    private double x ;
    private double y ;
    private double maxX ;
    private double maxY ;


    public Position(double x, double y, double maxX, double maxY){

        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxX;

    }

    public Position (Position position){

       this.x = position.getX();
        this.y = position.getX();
        this.maxX = position.getX();
        this.maxY = position.getX();

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        if(x > this.maxX)
            this.x = 0;
        else if (x < 0)
            this.x = maxX;
        else
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
