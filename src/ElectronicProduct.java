public class ElectronicProduct extends Product implements Returnable {

    public ElectronicProduct() {

    }

    public ElectronicProduct(String name , double price){
        super(name , price);
    }

    @Override
    public double calculateDiscount(){
        return getPrice() * 0.02;
    }

    @Override
    public boolean canBeReturned(int daysSincePurchase) {
     
        return daysSincePurchase <= 5;
    }
}
