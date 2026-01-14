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

        IOManager.print((person.addPet(new Pet("Sam", "perro"))) ? "Pet added successfully" : "Failed to add pet");
        IOManager.print((person.addPet(new Pet("Luna", "perro"))) ? "Pet added successfully" : "Failed to add pet");
        IOManager.print((person.addPet(new Pet("Theodoro", "perro"))) ? "Pet added successfully" : "Failed to add pet");

        /*
         * Se cae por un null pointer exception.
            Por que solo se tenía agregado una pet
         */
        for (Pet pet : person.getPetManager().getPets()) {
            IOManager.print(pet.getName());
        }
    }
}
