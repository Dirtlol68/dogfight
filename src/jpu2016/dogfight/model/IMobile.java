package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public interface IMobile {

    public Direction getDirection(){

        return null;
    }


    public void setDirection(Direction direction){

    }

    public Point getPosition(){

        return null;
    }

    public Dimension getDimension(){

        return null;
    }

    public int getWidth(){

        return 1;
    }

    public int getHeight(){

        return 1;
    }

    public int getSpeed(){

        return 1;
    }

    public Image getImage(){

        return null;
    }

    public void move(){

    }

    public void placeInArea(IArea area){

    }

    public boolean isPlayer(int player){

        return true;
    }

    public void setDogfightModel(DogfightModel dogfightModel){

    }

    public boolean hit(){

        return true;
    }

    public boolean isWeapon(){

        return true;
    }

}
