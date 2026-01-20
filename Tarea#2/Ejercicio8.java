public class Ejercicio8 {

    public static void main(String args[]) {

        IOManager.print("Digite una contrasena ");

        String passwoord = IOManager.readString();

        IOManager.print(
                (passwoord.length() >= 8 && passwoord.matches("[A-Z]+")) ? "Valid password" : "Invalid password");
    }

}
