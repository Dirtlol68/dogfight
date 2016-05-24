package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

import java.util.Observable;

/**
 * Created by arno on 23/05/16.
 */
public class DogfightView implements IViewSystem {
    protected GameFrame gameFrame;
    protected GraphicsBuilder graphicsBuilder;
    protected EventPerformer eventPerformer;

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){
        this.gameFrame = new GameFrame(); /**remplir**/
        this.gameFrame.setDogfightView(this);
        this.graphicsBuilder = new GraphicsBuilder(); /**remplir**/
        this.graphicsBuilder.setDogfightView(this);
        this.eventPerformer = new EventPerformer(); /**remplir**/
        this.eventPerformer.setDogfightView(this);

    }

    private void run(){

    }


    @Override
    public String displayMessage(String message) {
        return null;
    }

    @Override
    public void closeAll() {

    }
}
