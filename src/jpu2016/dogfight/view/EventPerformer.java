package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class EventPerformer implements IEventPerformer{

    private IOrderPerformer orderPerformer;
    private IEventPerformer eventPerformer;

    public EventPerformer(IOrderPerformer orderPerformer){
        this.orderPerformer = orderPerformer;
    }

    private UserOrder keyCodeToUserOrder(int keyCode){
        UserOrder userOrder;

        switch (keyCode){
            case KeyEvent.VK_Z :
                userOrder = new UserOrder(1,  Order.UP);
                break;
            case KeyEvent.VK_Q :
                userOrder = new UserOrder(1, Order.LEFT);
                break;
            case KeyEvent.VK_S :
                userOrder = new UserOrder(1, Order.DOWN);
                break;
            case KeyEvent.VK_D :
                userOrder = new UserOrder(1, Order.RIGHT);
                break;
            case KeyEvent.VK_SPACE :
                userOrder = new UserOrder(1, Order.SHOOT);
                break;
            case KeyEvent.VK_NUMPAD5 :
                userOrder = new UserOrder(2, Order.UP);
                break;
            case KeyEvent.VK_NUMPAD1 :
                userOrder = new UserOrder(2, Order.LEFT);
                break;
            case KeyEvent.VK_NUMPAD2 :
                userOrder = new UserOrder(2, Order.DOWN);
                break;
            case KeyEvent.VK_NUMPAD3 :
                userOrder = new UserOrder(2, Order.RIGHT);
                break;
            case KeyEvent.VK_NUMPAD0 :
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
        try {
            this.orderPerformer.orderPerform(userOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
