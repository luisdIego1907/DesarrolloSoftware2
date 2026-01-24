
public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray(5);

        Product[] products = (Product[]) array.getArray();

        Product p = new Product("BlackWidow", 100.50, Type.HEADPHONE);

        for(int i = 0 ; i < array.size(); i++){

            array.addObject(p);
        }

    }
}
