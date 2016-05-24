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
    private IEventPerformer eventPerformer;

    public EventPerformer(IOrderPerformer orderPerformer){
        this.orderPerformer = orderPerformer;
    }

    private UserOrder keyCodeToUserOrder(int keyCode){
        UserOrder userOrder;
        Order order = Order.DOWN;

        switch (new Order) {
            case UP:
                new Order();
                new UserOrder(1, Order.UP);
        }
        switch (keyCode){
            case KeyEvent.VK_Z :
                new UserOrder(1,  );
                break;
            case KeyEvent.VK_Q :
                new UserOrder(1, Order.LEFT);
                break;
            case KeyEvent.VK_S :
                new UserOrder(1, Order.DOWN);
                break;
            case KeyEvent.VK_D :
                new UserOrder(1, Order.RIGHT);
                break;
            case KeyEvent.VK_BACK_SPACE :
                new UserOrder(1, Order.SHOOT);
                break;
            case KeyEvent.VK_5 :
                new UserOrder(2, Order.UP);
                break;
            case KeyEvent.VK_1 :
                new UserOrder(2, Order.LEFT);
                break;
            case KeyEvent.VK_2 :
                new UserOrder(2, Order.DOWN);
                break;
            case KeyEvent.VK_3 :
                new UserOrder(2, Order.RIGHT);
                break;
            case KeyEvent.VK_NUMPAD0 :
                new UserOrder(2, Order.SHOOT);
                break;
        }
        return
    }

    @Override
    public void eventPerform(KeyEvent keyCode) {

        return null;
    }
}
