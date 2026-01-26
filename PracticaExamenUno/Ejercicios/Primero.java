
import java.util.Scanner;
public class Primero {
    
    public static void main(String[] args) {
        
        System.out.println("Me cago en visual studio");

        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        printValues(getValues(array, scanner));
    }

    public static int[] getValues(int[] array , Scanner scanner){

        int value = 0 ;

        for (int i = 0 ; i < array.length ; i++) {
            
            System.out.println("Digite un numero");

            value = scanner.nextInt();

            array[i] = value;

            scanner.nextLine();
        }

        return array;
    }

    public static void printValues(int[] array){

        System.out.println("El valor del arreglo son:\n");

        java.util.Arrays.stream(array).forEach(System.out :: println);
    }
}
