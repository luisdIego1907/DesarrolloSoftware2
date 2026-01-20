public class Ejercicio3 {

    public static void main(String args[]){

        String string1;
        String string2;

        IOManager.print("Digite una frase");

        string1 = IOManager.readString();

        IOManager.print("Digite otra frase");

        string2 = IOManager.readString();

        IOManager.print( string1.equalsIgnoreCase(string2) ? "Ambas son iguales" : "Son diferentes");
    }
}
