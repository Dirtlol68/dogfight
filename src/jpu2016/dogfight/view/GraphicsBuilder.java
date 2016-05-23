package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class GraphicsBuilder {
    public int GlobalWidth;
    public int GlobalHeight;

    public GraphicsBuilder(IDogfightModel dogfightModel){

    }

    public void applyModelToGraphic(Graphics graphics, ImageObserver observer){

    }

    private void buildEmptySky(){

    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){

    }

    public int getGlobalWidth() {
        return GlobalWidth;
    }

    public int getGlobalHeight() {
        return GlobalHeight;
    }

}
