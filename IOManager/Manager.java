package IOManager;

import java.util.Scanner;

public class Manager {

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(Object var) {

        System.out.println(var);
    }

    public static String readString() {

        String value = scanner.next();

        scanner.nextLine();

        return value;
    }

    public static double readDouble() {

        double value = scanner.nextDouble();

        scanner.nextLine();

        return value;
    }

    public static int readInt() {

        int value = scanner.nextInt();

        scanner.nextLine();

        return value;
    }
}
