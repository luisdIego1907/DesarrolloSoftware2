public class Product {

    private String name;
    private double precio;
    private Type type;

    public Product(String name , double precio , Type type){
        this.name =name;
        this.precio = precio;
        this.type = type;
    }

    public double getPrecio(){
        return precio;
    }

    public String toString(){
        return "name:" + name + " precio: " + precio + " type: " + type; 
    }
}
