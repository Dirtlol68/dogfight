package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class EventPerformer implements IEventPerformer{

    private IOrderPerformer orderPerformer;
    private UserOrder userOrder;

    public EventPerformer(IOrderPerformer orderPerformer){

    }

    private UserOrder keyCodeToUserOrder(int keyCode){
        switch (keyCode){
            case 122 :
                UserOrder u1u = new UserOrder(1, Order.UP);
                break;
            case 113 :
                UserOrder u1l = new UserOrder(1, Order.LEFT);
                break;
            case 115 :
                UserOrder u1d = new UserOrder(1, Order.DOWN);
                break;
            case 100 :
                UserOrder u1r = new UserOrder(1, Order.RIGHT);
                break;
            case 32 :
                UserOrder u1s = new UserOrder(1, Order.SHOOT);
                break;
            case 53 :
                UserOrder u2u = new UserOrder(2, Order.UP);
                break;
            case 49 :
                UserOrder u2l = new UserOrder(2, Order.LEFT);
                break;
            case 50 :
                UserOrder u2d = new UserOrder(2, Order.DOWN);
                break;
            case 51 :
                UserOrder u2r = new UserOrder(2, Order.RIGHT);
                break;
            case 48 :
                UserOrder u2s = new UserOrder(2, Order.SHOOT);
                break;
        }
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {

    }
}
