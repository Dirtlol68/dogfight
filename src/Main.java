import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.DogfightView;

import java.io.IOException;

public class Main {
    /*
    L’ordre dans lequel vous le ferez aura une incidence sur le jeu.
    En effet, les premiers créés seront sous les autres. Si vous créez
    les avions avant les nuages, ces derniers cacheront les avions.
    Vous pouvez donc tout à fait créer des nuages devant et d’autres derrières
    les avions. Les missiles (créés pendant la partie et donc en dernier)
    seront eux toujours devant. Si ce n’est pas le cas, c’est que la vue a dans
    sa boucle d’affichage commencé par la fin et mobiles.
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        int HEIGHT = 600, WIDTH = 600;
        final DogfightModel dogfightModel = new DogfightModel();

        dogfightModel.buildArea(new Dimension(HEIGHT, WIDTH));
        dogfightModel.addMobile(new Cloud(Direction.UP, new Position(HEIGHT/4,WIDTH/4,HEIGHT,WIDTH)));
        dogfightModel.addMobile(new Plane(1, Direction.RIGHT, new Position(51,WIDTH*0.1,HEIGHT,WIDTH), "Zero"));
        dogfightModel.addMobile(new Plane(2, Direction.LEFT, new Position(HEIGHT - 101,WIDTH*0.8,HEIGHT,WIDTH), "F4U"));
        dogfightModel.addMobile(new Cloud(Direction.RIGHT, new Position(HEIGHT*2.5/4,WIDTH*2.5/4, HEIGHT,WIDTH)));

        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
                dogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();

    }
}
