package jpu2016.gameframe;

import javax.swing.JPanel;
import java.awt.*;
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

    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();//???????
    }
}
