package jpu2016.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by Ahmed on 23/05/2016.
 */
public interface IGraphicsBuilder {

    public void applyModelToGraphic(Graphics graphics, ImageObserver observer);

    public int getGlobalWidth();

    public int getGlobalHeight();
}
