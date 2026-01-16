package solid.openclose.corrected;

public class Rectangle implements ShapeCalculatorOriginal{

    private double height;
    private double width;

    public Rectangle(double width , double height){
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }

}
