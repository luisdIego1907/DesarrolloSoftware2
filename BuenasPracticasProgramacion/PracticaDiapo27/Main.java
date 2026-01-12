package PracticaDiapo27;

import java.util.Scanner;

import IOManager.*;

public class Main {

    public static void main(String args[]) {

        try (

            Scanner scanner = new Scanner(System.in)

        ) {

            RegistroUsuario registroUsuario = new RegistroUsuario();
            
            RecuperacionCuenta recuperacionCuenta = new RecuperacionCuenta();
            
            System.out.println("Digite su correo");
            
            String correo = Manager.readString();
            
            registroUsuario.registro(correo);
            
            recuperacionCuenta.recuperacion(correo);
            
        }
    }

}

class Verificacion {

    public static boolean emailAddresVerification(String email) {

        return (email.contains("@") && email.contains("."));
    }
}
