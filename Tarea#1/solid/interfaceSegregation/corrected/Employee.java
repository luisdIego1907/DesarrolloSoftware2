package solid.interfaceSegregation.corrected;

public class Employee implements Sleep,Eat,Work{

    @Override
    public void work() {
        
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
       
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
       
        System.out.println("Employee is sleeping");
    }

}
