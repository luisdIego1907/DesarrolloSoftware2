public class DecimoSeptimo {

    public static void main(String[] args){

        Persona persona = new Persona(DiaSemana.LUNES);

        Manager.print(persona.toString());

        persona.correr();
    }
}

class Persona implements Correr{

    private DiaSemana diaSemana;

    public Persona(DiaSemana diaSemana){
        this.diaSemana = diaSemana;
    }

    public DiaSemana getDiaSemana(){
        return this.diaSemana;
    }

    @Override
    public String toString(){
        return "Dia: " + diaSemana + "-" + diaSemana.getDescripcion();
    }
    @Override
    public void correr(){
        Manager.print(this.toString() + " esta corriendo ");
    }
}
enum DiaSemana{

    LUNES("MalDia"), MARTES("Bueno") , MIERCOLES("Malo"),
     JUEVES("wueno"), VIERNES("Malo"), SABADO("Buenardo"), DOMINDO("Meh");
    
    private String descripcion;

    DiaSemana(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    
}