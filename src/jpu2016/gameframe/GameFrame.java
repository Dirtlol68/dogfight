package jpu2016.gameframe;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;


/**
 * Created by Ahmed on 23/05/2016.
 */
public class GameFrame implements KeyListener{

    private IEventPerformer iEventPerformer;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        iEventPerformer.eventPerform(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}