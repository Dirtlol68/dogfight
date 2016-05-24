package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Missile extends Mobile {

    private static int SPEED  = 4;
    private static int WIDTH  = 30;
    private static int HEIGHT  = 10;
    private static int MAX_DISTANCE_TRAVALED  = 1400;
    private static String IMAGE  = "missile";
    private int distanceTraveled = 0;


    public Missile(Direction direction, Position Position) {
        super(direction, Position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);


    }


    public static int getHeightADirection(Direction direction){

        if (direction == Direction.UP || direction == Direction.DOWN)
            return WIDTH;
        else
            return HEIGHT;
    }

    public static int getWidthADirection(Direction direction){

        if (direction == Direction.UP || direction == Direction.DOWN)
            return HEIGHT;
        else
            return WIDTH;
    }

   //rajouter deux méthodes static
    @Override
    public void move() {
        super.move();
        this.distanceTraveled++;
    }

    @Override
    public boolean isWeapon() {
        return super.isWeapon();
    }

}
