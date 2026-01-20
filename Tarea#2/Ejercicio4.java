public class Ejercicio4 {

    public static void main(String args[]){

        IOManager.print("Digite una frase ");

        String string = IOManager.readString();

        IOManager.print("Frase orginal: " + string + "\nFrase en mayusculas: " + string.toUpperCase() + "\nFrase en minusculas: " + string.toLowerCase());
    }
}
