public class FoodProduct extends Product {

    private String expirationDate;
    private boolean organic;

    public FoodProduct(){

    }
    
      public FoodProduct(String name , double price){
        super(name , price);
       
    }
    public FoodProduct(String name , double price, String expirationDate , boolean organic){
        super(name , price);
        this.expirationDate = expirationDate;
        this.organic = organic;
    }

    @Override
    public double calculateDiscount() {
       
        return 0.0;
    }
}
