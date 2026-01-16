package solid.liskov.corrected;

public class AreaCalculationCorrected {

    public static void main(String args[]){

        Figure rectangle = new Rectangle(10.5, 25.7);

        Figure square = new Square(25.19);

        System.out.println("Rectangle area: " + rectangle.area() + "\nSquare area: " + square.area());
    }
}
