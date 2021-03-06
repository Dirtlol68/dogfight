package jpu2016.dogfight.model;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Clément on 23/05/16.
 */
public interface IDogfightModel {

    public IArea getArea() ;
    public void buildArea(Dimension dimension);
    public void addMobile (IMobile mobile);
    public void removeMobile (IMobile mobile);
    public ArrayList<IMobile > getMobiles ();
    public IMobile getMobileByPlayer(int player) throws IOException;
    public void setMobilesHavesMoved();


}
