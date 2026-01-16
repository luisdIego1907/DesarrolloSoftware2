package solid.openclose.corrected;

public class Circle implements ShapeCalculatorOriginal{

    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
       
        return Math.PI * Math.pow(radius, 2);
    }

}
