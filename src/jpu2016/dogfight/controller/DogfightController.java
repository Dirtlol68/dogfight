package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.IViewSystem;

import java.util.ArrayList;

/**
 * Created by arno on 23/05/16.
 */
public class DogfightController implements IOrderPerformer{
    private static int TIME_SLEEP = 30;
    private IDogfightModel dogfightModel;
    private IViewSystem viewSystem;



    public DogfightController(IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;
    }

    /*
    Récupère les ordre envoyés par la vue et lance les méthode adéquat
    sur les éléments du modèles (plane.setDirection()).
     */
    @Override
    public void orderPerform(UserOrder userOrder){
        IMobile plane = dogfightModel.getMobileByPlayer(userOrder.getPlayer());
        switch (userOrder.getOrder()){
            case SHOOT:
                launchMissile(userOrder.getPlayer());
                break;
            case UP:
                plane.m
                break;
            case DOWN:
                break;
            case RIGHT:
                break;
            case LEFT:
                break;
            case NOP:
                break;
        }

    }

    /*
    Méthode appelant gameLoop() et affiche un message (via l'interface
    IViewSystem fournie par la vue de fin de partie.
     */
    public void play(){
        gameLoop();
        System.out.println("Fin de partie"); // A afficher sur l'écran.
    }
    /*
    Permet à la méthode play d'afficher un message de fin de partie.
     */
    public void setViewSystem(IViewSystem viewSystem){

    }

    /*
    Méthode permettant de créé un missile devant l'avion qui tire.
    Attention à ne pas le créé dessus sinon boom. Il faut donc gérer
    la direction de l'avion pour savoir ou créer le missile.
     */
    private void launchMissile (int player){
        IMobile plane = dogfightModel.getMobileByPlayer(player);
        /*
        Position de l'avion non pas par rapport au centre mais par rapport au coin haut gauche
         */
        int x = 0, y = 0;

        if(plane.getDirection() == Direction.RIGHT) {
            x = (int) (plane.getPosition().getX() + plane.getWidth()) + 1;
            y = (int) (plane.getPosition().getY());
        }
        else if(plane.getDirection() == Direction.LEFT){
            x = (int) (plane.getPosition().getX() - Missile.getWidthADirection(Direction.LEFT)) - 1;
            y = (int) (plane.getPosition().getY());

        }
        else if(plane.getDirection() == Direction.UP){
            x = (int) (plane.getPosition().getX());
            y = (int) (plane.getPosition().getY() + Missile.getHeightADirection(Direction.UP)) + 1;
        }
        else if(plane.getDirection() == Direction.DOWN){
            x = (int) (plane.getPosition().getX());
            y = (int) (plane.getPosition().getY() + plane.getHeight()) - 1;
        }
        else
            System.out.println("DogfightController - launchMisssile - ERROR : no direction find");

        //System.out.println("Coord missile : x:" + x + " y:" + y);
        dogfightModel.addMobile(new Missile(plane.getDirection(), new Position(x,y, Missile.getWidthADirection(plane.getDirection()),
                Missile.getHeightADirection(plane.getDirection()))));
    }

    /*
    Méthode lancer par play(), c'est une boucle infini stopper par
    la mort d'un avion. Elle lance la méthode move() sur chacun des
    mobiles présents.
     */
    private void gameLoop(){
        launchMissile(1);
        manageCollision();
    }

    /*
    Méthode qui consiste à déterminer si un avion(mobile) est en
    collision avec un missile(weapon).
     */
    private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon){
        /*
        weapon.x/weapon.wi >= mobile.x/mobile.wi
         */
        if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() /
                weapon.getWidth()))
                && ((weapon.getPosition().getX() / weapon.getWidth()) <=
                ((mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()))) {
            if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
                    / weapon.getHeight()))
                    && ((weapon.getPosition().getY() / weapon.getHeight()) <=
                    ((mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()))) {
                return true;
            }
        }
        return false;
    }

    /*
    Méthode permettant de gérer les collisions des missiles (via
    isWeaponOnMobile) et de détruire le missile ainsi que de prévenir
    l'avion en fonction du résultat.
     */
    private void manageCollision(){

        IMobile plane1 = dogfightModel.getMobileByPlayer(1);
        IMobile plane2 = dogfightModel.getMobileByPlayer(2);

        ArrayList<IMobile> weapon = new ArrayList<IMobile>();
        weapon = dogfightModel.getMobiles();

        Mobile mobile;
        for (int i =0; weapon.size() > i; i++){
            mobile= (Mobile) weapon.toArray()[i];
            if(mobile.isWeapon())
            {
                if(isWeaponOnMobile(plane1,mobile)) {
                    weapon.remove(mobile);
                    plane1.hit();
                }
                if(isWeaponOnMobile(plane2,mobile)) {
                    weapon.remove(mobile);
                    plane2.hit();
                }
            }
        }

    }
}
