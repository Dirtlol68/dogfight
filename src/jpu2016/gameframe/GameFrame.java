package jpu2016.gameframe;

import jpu2016.dogfight.view.DogfightView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class GameFrame implements KeyListener{
    protected DogfightView dogfightView;

    public DogfightView getDogfightView() {
        return dogfightView;
    }

    public void setDogfightView(DogfightView dogfightView) {
        this.dogfightView = dogfightView;
    }

    //GamePanel gamePanel = new GamePanel();

    public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable){

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}