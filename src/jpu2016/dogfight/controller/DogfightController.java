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

    }

    /*
    Méthode appelant gameLoop() et affiche un message (via l'interface
    IViewSystem fournie par la vue de fin de partie.
     */
    public void play(){

    }

    public void setViewSystem(IViewSystem viewSystem){

    }

    /*
    Méthode permettant de créé un missile devant l'avion qui tire.
    Attention à ne pas le créé dessus sinon boom. Il faut donc gérer
    la direction de l'avion pour savoir ou créer le missile.
     */
    private void launchMissile (int player){
        IMobile plane = dogfightModel.getMobileByPlayer(player);

        int x = 0, y = 0;

        if(plane.getDirection() == Direction.RIGHT) {
            x = (int) (plane.getPosition().getX() + plane.getWidth() / 2 + Missile.getWidthADirection(Direction.RIGHT) / 2);
            y = (int) (plane.getPosition().getY());
        }
        else if(plane.getDirection() == Direction.LEFT){
            x = (int) (plane.getPosition().getX() - plane.getWidth() / 2 - Missile.getWidthADirection(Direction.LEFT)/2);
            y = (int) (plane.getPosition().getY());
        }
        else if(plane.getDirection() == Direction.UP){
            x = (int) (plane.getPosition().getX());
            y = (int) (plane.getPosition().getY() + plane.getHeight() / 2 + Missile.getHeightADirection(Direction.UP)/2);
        }
        else if(plane.getDirection() == Direction.DOWN){
            x = (int) (plane.getPosition().getX());
            y = (int) (plane.getPosition().getY() - + plane.getHeight() / 2 - Missile.getHeightADirection(Direction.DOWN)/2);
        }
        else
            System.out.println("DogfightController - launchMisssile - ERROR : no direction find");

        new Missile(plane.getDirection(), new Position(x,y, Missile.getWidthADirection(plane.getDirection()), Missile.getHeightADirection(plane.getDirection())));
    }

    /*
    Méthode lancer par play(), c'est une boucle infini stopper par
    la mort d'un avion. Elle lance la méthode move() sur chacun des
    mobiles présents.
     */
    private void gameLoop(){

    }

    /*
    Méthode qui consiste à déterminer si un avion(mobile) est en
    collision avec un missile(weapon).
     */
    private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon){

        return false;
    }

    /*
    Méthode permettant de gérer les collisions des missiles (via
    isWeaponOnMobile) et de détruire le missile ainsi que de prévenir
    l'avion en fonction du résultat.
     */
    private void manageCollision(){

    }
}
