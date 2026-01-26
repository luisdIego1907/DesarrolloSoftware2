
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        getValues(array, scanner);
    }

    public static void getValues(int[] array , Scanner scanner){

        int value = 0 ;

        for (int i = 0 ; i < array.length ; i++) {
            
            System.out.println("Digite un numero");

            value = scanner.nextInt();

            array[i] = value;
        }

        java.util.Arrays.stream(array).forEach(System.out :: println);
    }
}
