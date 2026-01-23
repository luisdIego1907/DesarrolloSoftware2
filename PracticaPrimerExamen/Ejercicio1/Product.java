package PracticaPrimerExamen.Ejercicio1;

public class Product {

    private int id;
    private String name;
    private ProductType type;

    public Product(){

    }

    public Product(int id , String name , ProductType type){
        this.id = id;
        this.name =  name;
        this.type = type;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public ProductType getProductType(){
        return type;
    }

    @Override
    public String toString(){

        return "id: " + id + " name: " + name + " productType: " + type;
    }

}
