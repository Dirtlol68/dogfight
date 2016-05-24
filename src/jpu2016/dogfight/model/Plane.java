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
        super(direction, new Position(0,0,0,0), new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);

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
