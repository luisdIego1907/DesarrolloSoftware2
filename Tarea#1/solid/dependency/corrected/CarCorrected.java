package solid.dependency.corrected;

public class CarCorrected {

    private Engine engine;

    public CarCorrected(Engine engine){

        this.engine = engine;
    }

    public void start(){
        engine.start();;
    }
}

