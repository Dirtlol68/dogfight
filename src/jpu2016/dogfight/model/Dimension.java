package jpu2016.dogfight.model;

/**
 * Created by Clemsouille on 23/05/2016.
 */

public class Dimension {

    private int width ;
    private int height ;


    public Dimension(int width, int height){

    }

    public Dimension(Dimension dimension){

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

