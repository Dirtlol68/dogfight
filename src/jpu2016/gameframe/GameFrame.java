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

        JFrame jFrame = new JFrame();
        jFrame.setTitle(title);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == KeyEvent.VK_SPACE){

        }
        else if(keyEvent.getKeyCode() == KeyEvent.VK_0){

        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        iEventPerformer.eventPerform(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}