import java.util.Scanner;

public class IOManager {

    private final Scanner scanner = new Scanner(System.in);

    public static void print(Object var){

        System.out.println(var);
    }

    public String readString(){

        String value = scanner.next();

        scanner.nextLine();

        return value;
    }

    public double readDouble(){

        double value = scanner.nextDouble();

        scanner.nextLine();

        return value;
    }

    public int readInt(){

        int value = scanner.nextInt();

        scanner.nextLine();

        return value;
    }
   
}
