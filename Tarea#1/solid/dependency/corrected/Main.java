package solid.dependency.corrected;

public class Main {

    public static void main (String args[]){

        Engine engine = new Engine();

        CarCorrected car = new CarCorrected(engine);

        car.start();
    }
}
