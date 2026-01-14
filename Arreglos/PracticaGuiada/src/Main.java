public class Main {

    public static void main(String args[]) {

        /*
         * int[] numbers = { 10, 20, 30, 40, 50 };
         * 
         * String[] fruits = new String[3];
         * 
         * System.out.println("Numero en la posicion 2: " + numbers[1] +
         * "\nFruta posicion 2: " + fruits[2]);
         * 
         * for(int i = 0; i < person.getPets().length; i++){
         * System.out.println(person.getPets());
         * }
         */

        /*
         * Person person = new Person("Luis", 20, 3);
         * 
         * for (Pet pet : person.getPets()) {
         * System.out.println(pet.getName());
         * }
         */

        Person person = new Person("Luis", 20, new PetManager(3));
        /*
         * if(person.addPet(new Pet("Sam", "perro"))){
         * 
         * IOManager.print("Pet added successfully");
         * 
         * }else{
         * 
         * IOManager.print("Failed to add pet");
         * }
         */

        Pet sam = new Pet("Sam", "perro");
        Pet luna = new Pet("Luna", "perro");
        Pet theo = new Pet("Theo", "perro");

        IOManager.print((person.addPet(sam)) ? "Pet added successfully" : "Failed to add pet");
        IOManager.print((person.addPet(luna)) ? "Pet added successfully" : "Failed to add pet");
        IOManager.print((person.addPet(theo)) ? "Pet added successfully" : "Failed to add pet");

        /*
         * Se cae por un null pointer exception.
         * Por que solo se tenía agregado una pet
         */
        for (Pet pet : person.getPetManager().getPets()) {
            IOManager.print(pet.getName());
        }

        IOManager.print(person.removePet(sam) ? "Pet remove successfully" : "Failed to remove pet");

        /* 
        if(person.getPets().length == 0){
            IOManager.print("No pets found");
        }else{
            for(Pet pet : person.getPets()){
                IOManager.print(pet.getName());
            }
        }*/

        IOManager.print( (person.getPets().length == 0) ? "No pets found" : petsName(person) );

        IOManager.print( (person.updatePet(sam, 1) ? "Se agrego " : "No se agrego") );

        IOManager.print(" Comprobar que se agrego bien \n" + petsName(person));

    }
    static String petsName(Person person){

        String names = "";

        for(Pet pet : person.getPets()){
            names+= pet.getName() + "\n";
        }

        return names;
    }
}
