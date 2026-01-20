public class Ejercicio5 {

    public static void main(String args[]){

        IOManager.print("Digite una frase ");

        String frase = IOManager.readString();

        IOManager.print("Digite la palabra a buscar en la frase ");

        String palabra = IOManager.readString();
        
        IOManager.print( frase.contains(palabra) ? "La palabra esta en la frase " : "La palabra no esta en la frase ");
    }
}
