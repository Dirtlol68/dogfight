package jpu2016.dogfight.model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Clemsouille on 23/05/2016.
 */
public class Sky implements IArea{


    private Dimension dimension ;
    private DogfightModel dogfightModel;
    private Image image;

    public Sky (Dimension dimension){

        this.dimension = dimension;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }


    @Override
    public Image getImage() {
        try {
            this.image = ImageIO.read(new File("Image/sky.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Voici le chemin du ciel : Image/sky.png" );
        return image;
    }
}
