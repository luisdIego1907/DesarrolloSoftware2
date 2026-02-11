import java.util.ArrayList;

public class Manager {

    private ArrayList<Mascota> pets;

    public Manager() {
        pets = new ArrayList<>();
    }

    public boolean addPet(Mascota pet) {

        return this.pets.add(pet);
    }

    public boolean removePet(Mascota petRemove) {

        return this.pets.remove(petRemove);
    }

    public boolean isEmpty() {

        return this.pets.isEmpty();
    }

    public ArrayList<Mascota> getPets() {

        return this.pets;
    }

    public boolean update(Mascota petNueva, Mascota petVieja) {

        for (int i = 0; i < pets.size(); i++) {

            if (pets.get(i).getName().equals(petVieja.getName())) {

                pets.set(i, petNueva);
                return true;
            }
        }

        return false;
    }
}
