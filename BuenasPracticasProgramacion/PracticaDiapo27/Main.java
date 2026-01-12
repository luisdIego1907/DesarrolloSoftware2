package PracticaDiapo27;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        RegistroUsuario registroUsuario = new RegistroUsuario();

        RecuperacionCuenta recuperacionCuenta = new RecuperacionCuenta();

        System.out.println("Digite su correo");

        String correo = scanner.next();

        registroUsuario.registro(correo);

        recuperacionCuenta.recuperacion(correo);

        scanner.close();
    }

}

class Verificacion {

    public static boolean emailAddresVerification(String email) {

        return (email.contains("@") && email.contains("."));
    }
}
