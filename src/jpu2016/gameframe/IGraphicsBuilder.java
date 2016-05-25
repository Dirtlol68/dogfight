package jpu2016.gameframe;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;

/**
 * Created by Ahmed on 23/05/2016.
 */
public interface IGraphicsBuilder {

    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) throws IOException;

    public int getGlobalWidth();

    public int getGlobalHeight();
}
