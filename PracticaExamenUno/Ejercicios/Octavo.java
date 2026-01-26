

public class Octavo {

    /*
     * Se requiere desarrollar un programa en Java que lea una frase ingresada por
     * teclado y determine si dicha frase es un palíndromo. Para realizar esta
     * validación, el programa debe ignorar los espacios en blanco y no debe
     * diferenciar entre letras mayúsculas y minúsculas. Se asume que la frase
     * estará compuesta únicamente por letras y espacios, sin incluir signos de
     * puntuación, números ni caracteres especiales.
     * Un palíndromo se define como un texto que se lee de la misma forma tanto
     * de izquierda a derecha como de derecha a izquierda. El programa deberá
     * analizar la frase ingresada y mostrar por pantalla un mensaje indicando si la
     * frase corresponde o no a un palíndromo.
     * 
     */

    public static void main(String[] args) {
        
        Manager.print("Digite una palabra");

        String palabra = Manager.readString();

        Manager.print( isPalindrom(palabra) ? "Es palindromo" : "No lo es");
    }

    public static boolean isPalindrom(String palabra){

       
        return reverseWord(palabra).equals(palabra);
    }

    public static String reverseWord(String word){

        String newWord = "";

        for (int i = word.length() -1 ; i > -1 ; i--) {
            
            newWord += word.charAt(i);
        }

        Manager.print("Palabra del reves: " + newWord);
        return newWord;
    }
}
