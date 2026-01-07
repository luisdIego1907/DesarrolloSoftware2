public class ElectronicProduct extends Product {

    public ElectronicProduct() {

    }

    public ElectronicProduct(String name , double price){
        super(name , price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.02;
    }
}
