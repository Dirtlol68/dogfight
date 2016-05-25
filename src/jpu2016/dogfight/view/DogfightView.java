package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

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
        return null;
    }

    @Override
    public void closeAll() {

    }

    @Override
    public void run() {
    }
}
