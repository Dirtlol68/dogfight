package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Plane extends Mobile{

    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player ;


    public Plane (int player, Direction direction, Position position, String image){
        super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
        this.player = player;
    }

    /*
    Au cas ou isPlayer c'est fait ;)
     */
    @Override
    public boolean isPlayer(int player) {
        if(this.player == player)
            return true;
        return false;
    }

    @Override
    public boolean hit() {

        getDogfightModel().removeMobile(this);
        return true;
    }


}
