package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
import jpu2016.gameframe.GamePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

/**
 * Created by arno on 23/05/16.
 */
public class DogfightView implements IViewSystem, Runnable {
    private GameFrame gameFrame;
    private GraphicsBuilder graphicsBuilder;
    private EventPerformer eventPerformer;

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
        this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
        //this.graphicsBuilder.setGraphicsBuilder(this);
        this.eventPerformer = new EventPerformer(orderPerformer);
        this.gameFrame = new GameFrame("DogFight", eventPerformer, graphicsBuilder, observable);
        //this.gameFrame.setDogfightView(this);
    }


    @Override
    public String displayMessage(String message) {
        gameFrame.setVisible(false);
        JFrame jFrame = new JFrame("GameOver");
        jFrame.setTitle("GameOver");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setVisible(true);
        jFrame.setSize(200, 200);
        //jFrame.setBackground(Color.white);
        GamePanel gamePanel = new GamePanel(graphicsBuilder);
        JLabel image = new JLabel(new ImageIcon("Image/wasted.png"));
        gamePanel.add(image);
        jFrame.setContentPane(gamePanel);
        return message;
    }

    @Override
    public void closeAll() {

    }

    @Override
    public void run() {
    }
}
