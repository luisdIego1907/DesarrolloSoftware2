public class FoodProduct extends Product {

    private String expirationDate;
    private boolean organic;

    public FoodProduct() {

    }

    
    public FoodProduct(String name, double price , ProductStatus status) {
        super(name, price , status);

    }

    public FoodProduct(String name, double price, String expirationDate, boolean organic , ProductStatus status) {
        super(name, price , status);
        this.expirationDate = expirationDate;
        this.organic = organic;
    }

    @Override
    public double calculateDiscount() {

        return 0.0;
    }

}

