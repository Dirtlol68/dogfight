package jpu2016.dogfight.model;

import java.awt.Image;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public interface IArea {

    public Dimension getDimension(){

        return null;
    }

    public default Image getImage(){

        return null;
    }
}
