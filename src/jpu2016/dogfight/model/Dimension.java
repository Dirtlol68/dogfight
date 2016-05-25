package jpu2016.dogfight.model;

/**
 * Created by Clemsouille on 23/05/2016.
 */

public class Dimension {

    private int width ;
    private int height ;


    public Dimension(int width, int height){
        this.width = width;
        this.height = height;

    }

    public Dimension(Dimension dimension){

        this.height = dimension.getHeight();
        this.width = dimension.getWidth();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

