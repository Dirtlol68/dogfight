package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class EventPerformer implements IEventPerformer{

    protected DogfightView dogfightView;
    protected IOrderPerformer orderPerformer;

    public IOrderPerformer getOrderPerformer() {
        return orderPerformer;
    }

    public void setOrderPerformer(IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
        orderPerformer. //getter setter dans IOrderPerformer
    }

    UserOrder userOrderEP = new UserOrder();

    public DogfightView getDogfightView() {
        return dogfightView;
    }

    public void setDogfightView(DogfightView dogfightView) {
        this.dogfightView = dogfightView;
    }

    UserOrder userOrder = new UserOrder();
    

    public EventPerformer(IOrderPerformer orderPerformer){

    }

    private UserOrder keyCodeToUserOrder(int keyCode){

        return null;
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {

    }
}
