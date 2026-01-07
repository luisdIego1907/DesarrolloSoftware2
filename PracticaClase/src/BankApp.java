package PracticaClase.src;

import java.util.Scanner;

public class BankApp {

    Scanner scanner = new Scanner(System.in);
    String o = "";

    double amount = 0.0;
    String menu = "1 Depositar\n2 Retirar \n3 Mostrar Balance \n4 Salir";
    BanckAccount account;

    public BankApp(BanckAccount account) {
        this.account = account;
    }

    public void menu() {

        System.out.println(menu);

        o = scanner.next();

        switch (o) {

            case "1":

                System.out.println("Digite una cantidad a depositar");
                amount = scanner.nextDouble();
                this.account.deposit(amount);

                break;
                
            case "2":

                System.out.println("Digite una cantidad a retirar");
                amount = scanner.nextDouble();
                this.account.withdraw(amount);

                break;

            case "3":
                account.showBalance();
                break;

            case "4":
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }
}
