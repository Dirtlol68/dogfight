package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

/**
 * Created by arno on 23/05/16.
 */
public class DogfightController implements IOrderPerformer{
    private static int TIME_SLEEP = 30;
    private IDogfightModel dogfightModel;
    private IViewSystem viewSystem;

    Missile missile = new Missile(Direction.UP, new Dimension(20,20));//??????

    public DogfightController(IDogfightModel dogfightModel){

    }

    @Override
    public void orderPerform(UserOrder userOrder){

    }

    public void play(){

    }

    public void setViewSystem(IViewSystem viewSystem){

    }

    private void launchMissile (int player){

    }

    private void gameLoop(){

    }
}
