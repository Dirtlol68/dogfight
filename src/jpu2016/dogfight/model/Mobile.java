package jpu2016.dogfight.model;

import java.awt.*;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Mobile implements IMobile {

    private int speed ;
    private Position position;
    private Dimension dimension1;


    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.speed = speed;
    }

    @Override
    public Direction getDirection() {
        return null;
    }

    @Override
    public void setDirection(Direction direction) {

    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public Dimension getDimension() {
        return dimension1;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public void move() {

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

    @Override
    public void setDogfightModel(DogfightModel dogfightModel) {

    }

    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    private void moveUp(){

    }

    private void moveRight(){

    }

    private void moveDown(){

    }

    private void moveLeft(){

    }

    public Color getColor(){
        return getColor();
    }

}
