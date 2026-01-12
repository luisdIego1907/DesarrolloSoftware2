package PracticaDiapo27;

public class RecuperacionCuenta {

    public void recuperacion(String correo){

        String message = (Verificacion.emailAddresVerification(correo)) ? "Recuperado correctamente" : "No se pudo recuperar";

        System.out.println(message);
    }
}
