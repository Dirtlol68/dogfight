package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class DogfightModel extends Observable implements IDogfightModel{

    private Sky sky;
    private Mobile mobiles;

    public DogfightModel (){


    }


    @Override
    public IArea getArea() {
        return null;
    }

    @Override
    public void buildArea(Dimension dimension) {

    }

    @Override
    public void addMobile(IMobile mobile) {

    }

    @Override
    public void removeMobile(IMobile mobile) {

    }

    @Override
    public ArrayList<IMobile> getMobiles() {

        return null;
    }

    @Override
    public IMobile getMobileByPlayer(int player) {
        return null;
    }

    @Override
    public void setMobilesHavesMoved() {

    }
}
