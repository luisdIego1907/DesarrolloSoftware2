abstract class Product {

    private String name;
    private double price;
    private ProductStatus status;

    public Product() {

    }

    public Product(String name, double price , ProductStatus status){
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public ProductStatus getStatus(){
        return this.status;
    }
    @Override
    public String toString(){

        return "Name: " + name + " Price: " + price;
    }

    public static double calculateTax(double price){
        return price * 0.13;
    }

    public abstract double calculateDiscount();

    public boolean isAvailableForSale(){

        return status == ProductStatus.AVAILABLE;
    }
}