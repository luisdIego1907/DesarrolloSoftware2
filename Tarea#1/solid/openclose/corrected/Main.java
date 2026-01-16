package solid.openclose.corrected;

public class Main {

    public static void main(String args[]){

        Rectangle rectangle = new Rectangle(100.567, 99.97);

        Circle circle = new Circle(25.19);

        System.out.println("Rectangle area: " + rectangle.area() + "\nCircle area: " + circle.area());
    }
}
