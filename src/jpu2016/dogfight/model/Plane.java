package jpu2016.dogfight.model;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Plane extends Mobile{

    private static int SPEED = 2;
    private static int WIDTH = 200;
    private static int HEIGHT = 60;
    private int player ;


    public Plane (int player, Direction direction, Position position, String image) throws IOException {
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

        return true;
    }


}
