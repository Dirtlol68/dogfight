package jpu2016.dogfight.controller;


/**
 * Created by arno on 23/05/16.
 */
public class UserOrder implements  IUserOrder{

    private int player;
    protected Order order;/*?????*/

    public void UserOrder(){

    }

    @Override
    public Order getOrder() {
        return order;/*??????*/
    }

    @Override
    public int getPlayer() {
        return 0;
    }
}
