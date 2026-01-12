package PracticaDiapo27;

import IOManager.Manager;


public class Main {

    public static void main(String args[]) {

        RegistroUsuario registroUsuario = new RegistroUsuario();

        RecuperacionCuenta recuperacionCuenta = new RecuperacionCuenta();

        System.out.println("Digite su correo");

        String correo = Manager.readString();

        registroUsuario.registro(correo);

        recuperacionCuenta.recuperacion(correo);

    }

}

class Verificacion {

    public static boolean emailAddresVerification(String email) {

        return (email.contains("@") && email.contains("."));
    }
}
