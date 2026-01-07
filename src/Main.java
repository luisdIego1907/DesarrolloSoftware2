public class Main {

    public static void main(String[] args) {
 
        /*Siempre que se crea una clase, se crea un constructor por defecto */
        //Product product = new Product();

       // product.setName("Laptop");
      //  product.setPrice(99.99);
    //   System.err.print(product.getName() + "\nPrecio: " + product.getPrice());
        //Tira el valor por defecto por el constructor que se creó de forma automatica

  //      System.out.println(product);

//        System.out.println("Tax: " + Product.calculateTax(product.getPrice()));


        Product p2 = new FoodProduct("Leche" , 11.99);

        Product p3 = new ElectronicProduct("Mouse" , 110.50);

        System.out.println(p2.toString() + " ---- " + p3.toString());

        System.out.println("Discount: " + p2.calculateDiscount() + "\n Discount: " + p3.calculateDiscount());
    }
}


