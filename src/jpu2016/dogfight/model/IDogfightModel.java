package jpu2016.dogfight.model;

/**
 * Created by Clément on 23/05/16.
 */
public interface IDogfightModel {

    public Model.IArea getImage() ;
    public void buildArea(Dimension dimension);
    public void addMobile (IMobile mobile);
    public void removeMobile (IMobile mobile);
    public ArrayList <IMobile > getMobiles ();
    public IMobile getMobileByPlayer(int player);
    public void setMobilesHavesMoved();

}
