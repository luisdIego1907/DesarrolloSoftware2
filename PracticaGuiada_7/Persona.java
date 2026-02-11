import java.util.ArrayList;

public class Persona {

    private String name;
    private int age;
    private Manager manager;

    public Persona(String name, int age, Manager manager) {
        this.name = name;
        this.age = age;
        this.manager = manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean addPet(Mascota pet) {

        return manager.addPet(pet);
    }

    public boolean removePet(Mascota pet) {

        return manager.removePet(pet);
    }

    public Manager getPetManager() {
        return this.manager;
    }

    public ArrayList<Mascota> getPets() {

        return this.manager.getPets();
    }

    public boolean update(Mascota petNueva , Mascota petVieja){

        return this.manager.update(petNueva , petVieja);
    }

}
