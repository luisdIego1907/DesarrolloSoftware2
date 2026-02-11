public class PracticaGuiada_7 {

    /*
    Jose Daniel Bolaños Alftaro
     */
    public static void main(String[] args) {

        System.err.println("Prueba impresion");

        Manager manager = new Manager();

        Persona p = new Persona("Anderson", 5, manager);

        Mascota m = new Mascota("aaaaaaaa", "bbbbbbbbb");

        Mascota m2 = new Mascota("cccccc", "dddddd");

        System.out.println(p.addPet(m) ? "Se agrego m" : "No se agrego");

        System.out.println(p.addPet(m2) ? "Se agrego m2" : "No se agrego");

        manager.getPets().stream().forEach(System.out::println);

        System.out.println(p.removePet(m2) ? "Se elimino m2" : "No se agrego");

        manager.getPets().stream().forEach(System.out::println);

        Mascota m3 = new Mascota("zzzzzzzzz" , "zzzzzzzzz");

        System.out.println( p.update(m3 , m) ? "Se actualizo" : "Error");

         manager.getPets().stream().forEach(System.out::println);

    }
}
