package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class GraphicsBuilder implements IGraphicsBuilder {

    private BufferedImage emptySky;
    private IDogfightModel dogfightModel;

    public GraphicsBuilder(IDogfightModel dogfightModel){

    }
    private void buildEmptySky(){

    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){

    }

    @Override
    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

    }

    @Override
    public int getGlobalWidth() {
        return 0;
    }

    @Override
    public int getGlobalHeight() {
        return 0;
    }
}
