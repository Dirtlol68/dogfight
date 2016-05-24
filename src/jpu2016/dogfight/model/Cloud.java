package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Cloud extends Mobile {


    private static int SPEED  = 4;
    private static int WIDTH  = 30;
    private static int HEIGHT  = 10;
    private static String IMAGE  = "missile";


    public Cloud(Direction direction, Position position) {
        super(direction, new Position(0,0,0,0), new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);

    }


}
