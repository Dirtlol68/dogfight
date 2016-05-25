package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Mobile implements IMobile {

    private int speed ;
    private Position position;
    private Dimension dimension1;
    private DogfightModel dogfightModel;
    private Direction direction;
    private Image image4;


    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.direction = direction;
        this.position = position;
        this.dimension1 = dimension;
        this.speed = speed;
        //this.image4 = ;
    }


    @Override
    public Direction getDirection() {

        return this.direction;
    }

    @Override
    public void setDirection(Direction direction) {

    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Dimension getDimension() {
        return this.dimension1;
    }

    @Override
    public int getWidth() {
        return getDimension().getWidth();
    }

    @Override
    public int getHeight() {
        return getDimension().getWidth();
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public Image getImage() {
        return this.image4;
    }

    @Override
    public void move() {
        switch (this.getDirection()){
            case UP:
                this.moveUp();
                break;
            case DOWN:
                this.moveDown();
                break;
            case RIGHT:
                this.moveRight();
                break;
            case LEFT:
                this.moveLeft();
                break;
        }
    }

    @Override
    public void placeInArea(IArea area) {

    }

    @Override
    public boolean isPlayer(int player) {
        return false;
    }

    public IDogfightModel getDogfightModel(){
        return getDogfightModel();
    }

    /*
    Dans la méthode setDogfightModel(), il ne faut pas oublier d’initialiser les attributs maxX et
maxY de la position du mobile en récupérant celle du dogFightModel. Sans cela vos mobile
vont se promener un peu n’importe où.
     */
    @Override
    public void setDogfightModel(IDogfightModel dogfightModel) {

        position.setMaxX(600.00);
        position.setMaxY(600.00);
    }

    @Override
    public boolean hit() {
        return false;
    }

    /*
    isWeapon fonctionne !!
     */
    @Override
    public boolean isWeapon() {
        if(this.getClass().isInstance(new Missile(Direction.UP, new Position(0,0,0,0))))
            return true;
        return false;
    }

    private void moveUp(){
        this.position.setY(this.getPosition().getY() - this.getSpeed());
    }

    private void moveRight(){
        this.position.setX(this.getPosition().getX() + this.getSpeed());
    }

    private void moveDown(){
        this.position.setY(this.getPosition().getY() + this.getSpeed());
    }

    private void moveLeft(){
        this.position.setX(this.getPosition().getX() - this.getSpeed());
    }

    public Color getColor(){
        return getColor();
    }

}
