public class PetManager {

    private int petCounter;
    private Pet[] pets;

    public PetManager(int numPets) {
        this.petCounter = numPets;

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
}
