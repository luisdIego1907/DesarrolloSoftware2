public class Ejercicio1 {

    public static void main(String[] args) {
        System.err.println("Odio visual");
        Person p = new Person();
    }
}

class Person{

    public Person(){

    }

    public void registerPerson(int edad){

        if ( edad < 0 || edad > 120) {
            
            throw new EdadInvalidaException("Edad no valida");
        }
        System.out.println("Edad valida");
    }
}

class EdadInvalidaException extends IllegalArgumentException{

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
