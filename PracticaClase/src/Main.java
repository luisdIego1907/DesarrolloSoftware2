package PracticaClase.src;

public class Main {

    public static void main(String x[]){

        BanckAccount a = new BanckAccount( "Luis", 1500.25);

        BankApp app = new BankApp(a);

        while (true) { 
            
            app.menu();
        }
    }
}
