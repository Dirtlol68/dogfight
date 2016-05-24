package jpu2016.dogfight.model;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Mobile implements IMobile {

    private int speed ;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.speed = speed;
    }
}
