package solid.liskov.corrected;

public class Square extends Figure{

    private double length;
    
    public Square(double length){

        this.length = length;
    }
    @Override
    double area() {
        
        return length * length;
    }

}
