import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.DogfightView;

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
    public static void main(String[] args) {
        int HEIGHT = 600, WIDTH = 600;
        final DogfightModel dogfightModel = new DogfightModel();
        Sky sky = new Sky(new Dimension(HEIGHT,WIDTH));
        dogfightModel.addMobile(new Cloud(Direction.UP, new Position(200,200,HEIGHT,WIDTH)));
        dogfightModel.addMobile(new Plane(1, Direction.RIGHT, new Position(100,100,HEIGHT,WIDTH), "Zero_RIGHT"));
        dogfightModel.addMobile(new Plane(2, Direction.LEFT, new Position(500,100,HEIGHT,WIDTH), "F4U_RIGHT"));
        dogfightModel.addMobile(new Cloud(Direction.UP, new Position(400,400, HEIGHT,WIDTH)));

        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
                dogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();
    }
}
