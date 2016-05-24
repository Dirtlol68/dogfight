package jpu2016.dogfight.model;

import sun.net.www.content.text.plain;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class DogfightModel extends Observable implements IDogfightModel{

    private Sky sky;
    private ArrayList<IMobile> mobiles = new ArrayList<IMobile>(); //changement par Arno. Regarde '*' dans le diagramme tu instancie plusieurs

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
        this.mobiles.add(mobile);
    }

    @Override
    public void removeMobile(IMobile mobile) {

    }
    /*
    Du coup getMobiles() est fait aussi et getMobileByPlayer
     */
    @Override
    public ArrayList<IMobile> getMobiles() {

        return mobiles;
    }

    @Override
    public IMobile getMobileByPlayer(int player) {
        Plane plane;
        for (int i = 0; mobiles.size() > i;i++){
        for (int i = 0; mobiles.size() > i;i++){
            if(mobiles.toArray()[i].getClass().isInstance(new Plane(0, Direction.DOWN,new Position(0,0,0,0)  , "Test"))){
                plane = (Plane) mobiles.toArray()[i];
                if(plane.isPlayer(player))
                    return plane;
            }
        }
        return null;
    }

    @Override
    public void setMobilesHavesMoved() {

    }
}
