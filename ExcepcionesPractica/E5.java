/* Crea una excepción ArchivoInvalidoException.

Crea una clase LectorArchivo.

Implementa un método leerArchivo(String nombreArchivo) que:

Solo permita archivos .txt

Si no es .txt, lance la excepción

Obliga a manejar la excepción con throws o try-catch.*/
public class E5 {

   public static void main(String[] args) {
    
        System.out.println("ME CAGO EN VISUAL");

        LeerArchivo l = new LeerArchivo();

        l.leerArchivo("eee.txt");
   }
}

class LeerArchivo{

    public void leerArchivo(String nombre) {

        try{
            if( !(nombre.contains(".txt"))){

                throw new ArchivoInvalidoException("Archivo no valido");
            }else{
                System.out.println("Archivo valido");
            }
        }catch(ArchivoInvalidoException e){

            e.printStackTrace();
        }
        
    }
}
class ArchivoInvalidoException extends Exception{

    public ArchivoInvalidoException(String mensaje){
        super(mensaje);
    }
}