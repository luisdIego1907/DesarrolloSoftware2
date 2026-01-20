public class Ejercicio2 {

    public static void main(String args[]){

        IOManager.print("Digite una palabra");

        String string = IOManager.readString();

        IOManager.print("Primer caracter: " + string.charAt(0) + " Ultimo caracter: " + string.charAt(string.length() - 1 ));
    }
}
