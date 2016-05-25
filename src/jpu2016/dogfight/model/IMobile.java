package jpu2016.dogfight.model;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public interface IMobile {

    public Direction getDirection();
    public void setDirection(Direction direction);
    public Position getPosition();
    public Dimension getDimension();
    public int getWidth();
    public int getHeight();
    public int getSpeed();
    public Image getImage() throws IOException;
    public void move();
    public void placeInArea(IArea area);
    public boolean isPlayer(int player);

    /*
    Dans la méthode setDogfightModel(), il ne faut pas oublier d’initialiser les attributs maxX et
maxY de la position du mobile en récupérant celle du dogFightModel. Sans cela vos mobile
vont se promener un peu n’importe où.
     */
    public void setDogfightModel(IDogfightModel dogfightModel);

    public boolean hit();
    public boolean isWeapon() throws IOException;

}
