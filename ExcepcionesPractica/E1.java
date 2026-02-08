public class E1 {

    public static void main(String[] args){
        System.err.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        P p = new P();

        p.registerPerson(121);
    }
}
//El visual agarra una Person random de otro package. Por eso solo p.
class P{

    public P(){

    }

    public void registerPerson(int edad){

        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad no valida: " + 120 + ". Rango valido 0-120.");
        }
        System.out.println("Edad VALIDA");
    }
}

class EdadInvalidaException  extends IllegalArgumentException{

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }
}
