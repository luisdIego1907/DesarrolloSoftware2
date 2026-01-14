public class PetManager {

    private int petCounter;
    private Pet[] pets;

    public PetManager(int numPets) {
        this.petCounter = numPets;
        pets = new Pet[numPets];

    }

    public boolean addPet(Pet pet) {

        for (int i = 0; i < pets.length; i++) {

            if (pets[i] == null) {

                pets[i] = pet;

                this.petCounter++;

                return true;
            }
        }

        return false;
    }

    public boolean removePet(Pet pet){

        for(int i = 0; i < pets.length; i++){
    
            if(pets[i] != null && pets[i].equals(pet)){

                //Corre a la izquierda los elementos posteriores al eliminado.
                //De esta forma, el arreglo no queda con "brincos" o espacios
                // en null
                for(int j = i; j < pets.length -1 ; j++){

                    pets[j] = pets[j+1];
                }

                pets[pets.length - 1] = null;
                
                petCounter--;

                return true;
            }
        }

        return false;
    }

    public Pet[] getPets(){
        return this.pets;
    }
}
