package PracticaDiapo27;

public class RegistroUsuario {

 
    public void registro(String email){

        String message = (Verificacion.emailAddresVerification(email)) ? "Se registro correcetamente" : "No se pudo registrar";

        System.out.println(message);
        
    }
}
