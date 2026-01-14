public class PetManager {

    private int petCounter;
    private Pet[] pets;

    public PetManager(int numPets) {
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

    public boolean removePet(Pet pet) {

        for (int i = 0; i < pets.length; i++) {

            if (pets[i] != null && pets[i].equals(pet)) {

                // Corre a la izquierda los elementos posteriores al eliminado.
                // De esta forma, el arreglo no queda con "brincos" o espacios
                // en null
                for (int j = i; j < pets.length - 1; j++) {

                    pets[j] = pets[j + 1];
                }

                pets[pets.length - 1] = null;

                petCounter--;

                return true;
            }
        }

        return false;
    }

    public Pet[] getPets() {

        Pet[] pets = new Pet[this.petCounter];

        for (int i = 0; i < this.petCounter; i++) {
            pets[i] = this.pets[i];
        }

        return pets;
    }

    public boolean updatePets(Pet pet, int index) {

        if ((index < 0) || (index > petCounter) || pet == null) {

            return false;

        } else if (isEmpty(pet, index)) {

            return addPet(pet, index);

        } else {

            return agregarMoviendo(pet, index);

        }

    }

    public boolean isEmpty(Pet pet, int index) {

        for (int i = 0; i < petCounter; i++) {

            if (this.pets[i] == null) {

                return true;
            }
        }
        IOManager.print("False en isEmpty");
        return false;
    }

    public boolean addPet(Pet pet, int index) {

        this.pets[index] = pet;

        petCounter++;

        return true;
    }

    public boolean agregarMoviendo(Pet pet, int index) {

        for (int i = 0; i < pets.length; i++) {

            if (i == index) {

                Pet provicional = pets[i];

                pets[i] = pet;

                pets[i + 1] = provicional;

                petCounter++;

                return true;
            }
        }

        IOManager.print("false en agregarMoviendo");
        return false;
    }
}
