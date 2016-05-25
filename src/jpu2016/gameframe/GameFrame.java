package jpu2016.gameframe;

import jpu2016.dogfight.view.DogfightView;
import jpu2016.dogfight.view.EventPerformer;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;


/**
 * Created by Ahmed on 23/05/2016.
 */
public class GameFrame extends JFrame implements KeyListener{

    private IEventPerformer eventPerformer;
    //private DogfightView dogfightView;

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){
        this.eventPerformer = performer;
        JFrame jFrame = new JFrame(title);
        //this.setSize(getWidth(),getHeight());
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(600, 600);
        GamePanel gamePanel = new GamePanel(graphicsBuilder);
        this.setContentPane(gamePanel);
        observable.addObserver(gamePanel);
    }

    /*public void setDogfightView(DogfightView dogfightView){
        this.dogfightView = dogfightView;
    }

    public DogfightView getDogfightView(){
        return dogfightView;
    }*/

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        this.eventPerformer.eventPerform(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}