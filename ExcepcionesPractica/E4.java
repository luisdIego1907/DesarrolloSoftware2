/*
Crea dos excepciones:

UsuarioIncorrectoException

ContrasenaIncorrectaException

Crea una clase LoginService con un usuario y contraseña correctos.

En el método login, valida:

Usuario incorrecto → lanza UsuarioIncorrectoException

Contraseña incorrecta → lanza ContrasenaIncorrectaException

Maneja cada excepción por separado en main.
 */
public class E4 {

    public static void main(String[] args) {
        
        LoginService l = new LoginService();

        String user = "luis";
        String password = "fghbn";

        l.login(user , password);
    }
}

class UsuarioIncorrectoException extends RuntimeException{

    public UsuarioIncorrectoException(String mensaje){
        super(mensaje);
    }
}

class ContrasenaIncorrectaException extends RuntimeException{

    public ContrasenaIncorrectaException(String mensaje){
        super(mensaje);
    }
}

class LoginService{

    private String user;
    private String password;

    public LoginService(){
        this.user = "luis";
        this.password = "123";
    }

    public void login(String user , String password){

        if (this.user.equals(user) && this.password.equals(password)) {
            
            System.out.println("Credenciales correctas");

        }else if( !(this.user.equals(user)) ){

            throw new UsuarioIncorrectoException("Usuario incorrecto");

        }else if ( !(this.password.endsWith(password))) {
            
            throw new ContrasenaIncorrectaException("Contrasena incorrecta");
        }
    }
}