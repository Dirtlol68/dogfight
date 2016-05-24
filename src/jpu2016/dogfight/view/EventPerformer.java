package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

import java.awt.event.KeyEvent;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class EventPerformer {
    protected DogfightView dogfightView;

    public DogfightView getDogfightView() {
        return dogfightView;
    }

    public void setDogfightView(DogfightView dogfightView) {
        this.dogfightView = dogfightView;
    }

    UserOrder userOrder = new UserOrder();
    public EventPerformer(IOrderPerformer orderPerformer){

    }

    public void eventPerform(KeyEvent keyCode){

    }

    private UserOrder keyCodeToUserOrder(int keyCode){

        return null;
    }
}
