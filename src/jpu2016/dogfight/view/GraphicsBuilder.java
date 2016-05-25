package jpu2016.dogfight.view;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Mobile;
import jpu2016.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ahmed on 23/05/2016.
 */
public class GraphicsBuilder implements IGraphicsBuilder {

    private BufferedImage emptySky;
    private IDogfightModel dogfightModel;

    public GraphicsBuilder(IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;

    }
    private void buildEmptySky(){
        //this.emptySky = new BufferedImage(dogfightModel.getArea().getDimension().getWidth(),dogfightModel.getArea().getDimension().getHeight(),Transparency.TRANSLUCENT);
        //this.emptySky = new BufferedImage(400,400,Transparency.OPAQUE);


    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) throws IOException {

        final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(), Transparency.TRANSLUCENT);
        final Graphics graphicsMobile = imageMobile.getGraphics();
        graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer);
        graphics.drawImage(imageMobile, (int) mobile.getPosition().getX(), (int) mobile.getPosition().getY(), observer);
        System.out.println("LALALALAL : " + this.dogfightModel.getArea());
        final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.dogfightModel.getArea().getDimension().getWidth();
        final boolean isVerticalOut = (mobile.getPosition().getY() + mobile.getHeight()) > this.dogfightModel.getArea().getDimension().getHeight();

        if (isHorizontalOut) {
            final BufferedImage imageMobileH = imageMobile.getSubimage(this.dogfightModel.getArea().getDimension().getWidth() - (int) mobile.getPosition().getX(), 0,
                            (mobile.getWidth() - this.dogfightModel.getArea().getDimension().getWidth()) + (int) mobile.getPosition().getX(), mobile.getHeight());
            graphics.drawImage(imageMobileH, 0, (int) mobile.getPosition().getY(), observer);
        }
        if (isVerticalOut) {
            final BufferedImage imageMobileV = imageMobile.getSubimage(0, this.dogfightModel.getArea().getDimension().getHeight() - (int) mobile.getPosition().getY(), mobile.getWidth(),
                    (mobile.getHeight() - this.dogfightModel.getArea().getDimension().getHeight()) + (int) mobile.getPosition().getY());
            graphics.drawImage(imageMobileV, (int) mobile.getPosition().getX(), 0, observer);
        }
        if (isHorizontalOut && isVerticalOut) {
            final BufferedImage imageMobileHV = imageMobile.getSubimage(this.dogfightModel.getArea().getDimension().getWidth() - (int)mobile.getPosition().getX(),
                    this.dogfightModel.getArea().getDimension().getHeight() - (int) mobile.getPosition().getY(), (mobile.getWidth() - this.dogfightModel.getArea().getDimension().getWidth())
                            + (int)mobile.getPosition().getX(), (mobile.getHeight() - this.dogfightModel.getArea().getDimension().getHeight()) + (int)mobile.getPosition().getY());
            graphics.drawImage(imageMobileHV, 0, 0, observer);
        }
    }
    /*
    La méthode applyModelToGraphic() s’occupe de transformer les données contenues dans le
    modèle en image. Elle fait une boucle sur l’ensemble des éléments mobiles et lance pour
    chacun la méthode drawMobile().
     */
    @Override
    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) throws IOException {
        Mobile mobile;
        ArrayList<IMobile> weapon;
        System.out.println("Je vais imprimer le ciel");
        final BufferedImage imageMobile = new BufferedImage(dogfightModel.getArea().getDimension().getWidth(), dogfightModel.getArea().getDimension().getHeight(), Transparency.TRANSLUCENT);
        final Graphics graphicsMobile = imageMobile.getGraphics();
        graphicsMobile.drawImage(dogfightModel.getArea().getImage(), 0, 0, dogfightModel.getArea().getDimension().getWidth(), dogfightModel.getArea().getDimension().getHeight(), observer);
        graphics.drawImage(imageMobile, 0, 0, observer);



        weapon = dogfightModel.getMobiles();
        for(int i = 0; weapon.size() > i; i++){
            mobile = (Mobile) weapon.toArray()[i];
            drawMobile(mobile, graphics,observer);
        }
    }

    @Override
    public int getGlobalWidth() {
        return 0;
    }

    @Override
    public int getGlobalHeight() {
        return 0;
    }
}
