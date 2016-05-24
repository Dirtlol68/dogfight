package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Plane extends Mobile{

    protected static int SPEED = 2;
    protected static int WIDTH = 100;
    protected static int HEIGHT = 30;
    protected int player ;

    public Plane (int player, Direction direction, Position position, String image){

    }


    @Override
    public boolean isPlayer(int player) {
        return super.isPlayer(player);
    }

    @Override
    public boolean hit() {
        return super.hit();
    }


}
