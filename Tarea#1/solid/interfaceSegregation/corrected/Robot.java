package solid.interfaceSegregation.corrected;

public class Robot implements Work{

    @Override
    public void work() {
        
        System.out.println("Robot is working");
    }

}
