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
        UserOrder userOrder;
        switch (keyCode){
            case 122 :
                userOrder = new UserOrder(1, Order.UP);
                break;
            case 113 :
                userOrder = new UserOrder(1, Order.LEFT);
                break;
            case 115 :
                userOrder = new UserOrder(1, Order.DOWN);
                break;
            case 100 :
                userOrder = new UserOrder(1, Order.RIGHT);
                break;
            case 32 :
                userOrder = new UserOrder(1, Order.SHOOT);
                break;
            case 53 :
                userOrder = new UserOrder(2, Order.UP);
                break;
            case 49 :
                userOrder = new UserOrder(2, Order.LEFT);
                break;
            case 50 :
                userOrder = new UserOrder(2, Order.DOWN);
                break;
            case 51 :
                userOrder = new UserOrder(2, Order.RIGHT);
                break;
            case 48 :
                userOrder = new UserOrder(2, Order.SHOOT);
                break;
            default:
                userOrder = new UserOrder(0, Order.NOP);
        }
        return userOrder;
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {
        UserOrder userOrder = keyCodeToUserOrder(keyCode.getKeyCode());
    }
}
