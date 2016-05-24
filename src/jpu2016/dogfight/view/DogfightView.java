package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

import java.util.Observable;

/**
 * Created by arno on 23/05/16.
 */
public class DogfightView implements IViewSystem {
    private GameFrame gameFrame;

    public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable){

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
