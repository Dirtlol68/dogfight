package jpu2016.gameframe;

import jpu2016.dogfight.controller.DogfightController;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class GamePanel extends JPanel implements Observer {
    private IGraphicsBuilder graphicsBuilder;
    public GamePanel(IGraphicsBuilder graphicsBuilder){

        this.graphicsBuilder = graphicsBuilder;
    }

    public void paintComponent(Graphics graphics){
        try {
            graphicsBuilder.applyModelToGraphic(graphics, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }
}
