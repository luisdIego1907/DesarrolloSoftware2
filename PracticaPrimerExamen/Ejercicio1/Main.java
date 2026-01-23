package PracticaPrimerExamen.Ejercicio1;

import IOManager.*;

public class Main {

    static int[] products = new int[5];

    public static void main(String args[]) {

        Manager.print("Hello world");
    }

    public static void createProduct() {

        Manager.print("Digite el id");

        int id = Manager.readInt();

        Manager.print("Digite el nombre");

        String name = Manager.readString();

        ProductType type = ProductTypeChoise();

        Product product = new Product(id, name, type);
    }

    public static ProductTypeChoise(){

        ProductType chosenType = null;

        Manager.print("1: KeyBoard, 2: Mouse , 3: Headphone , 4: MousePad");

        int choise = Manager.readInt();

        switch (choise) {
            case 1:
                chosenType = ProductType.keyBoard;
            break;

            case 2:
                chosenType = ProductType.mouse;
            break;

            case 3:
                chosenType = ProductType.headphone;
            break;

            case 4:
                chosenType = ProductType.mousePad;
            break;

            default:
                Manager.print("Valor no especificado");
            break;
        }

        return chosenType;
    }

    public static void addProduct(Product product) {

        for(int i = 0 ; i < products.length; i++){

            if(products[i] == null){
                products[i] == product;
            }
        }
    }

    public static void createMoreSpace(Product[] array , Product product){

        
    }

}

    

          

        
         
          

         

         

        

         

        
