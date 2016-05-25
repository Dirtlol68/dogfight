package jpu2016.dogfight.controller;


/**
 * Created by arno on 23/05/16.
 */
public class UserOrder implements  IUserOrder{

    private int player;
    private Order order;



    public void UserOrder(int player, Order order){
        this.player = player;
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public int getPlayer() {
        return player;
    }
}
