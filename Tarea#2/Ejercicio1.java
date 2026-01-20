
public class Ejercicio1 {

    public static void main(String args[]){

        IOManager.print("Digite una hilera de caracteres");

        String string = IOManager.readString();

        IOManager.print("La cantidad de caracteres que tiene " + string + " es de: " + string.length());
    }
}
