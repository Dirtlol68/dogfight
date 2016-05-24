package jpu2016.dogfight.controller;


/**
 * Created by arno on 23/05/16.
 */
public class UserOrder implements  IUserOrder{

    private int player;

    public void UserOrder(){

    }

    @Override
    public Order getOrder() {
        return null;
    }

    @Override
    public int getPlayer() {
        return 0;
    }
}
