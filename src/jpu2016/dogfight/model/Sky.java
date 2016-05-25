package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Sky implements IArea{


    private Dimension dimension ;
    private DogfightModel dogfightModel;
    private Image image;

    public Sky (Dimension dimension){

        this.dimension = dimension;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }


    @Override
    public Image getImage() {
        return image;
    }
}
