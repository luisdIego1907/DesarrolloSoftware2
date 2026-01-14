public class Person {

    private String name;
    private int age;
    private PetManager petManager;

/* 
     public Person(){

    }
*/
    public Person(String name , int age  , PetManager petManager){
        this.name = name;
        this.age = age;
        this.petManager = petManager;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public boolean addPet(Pet pet){

        return petManager.addPet(pet);
    }

    public boolean removePet(Pet pet){

        return petManager.removePet(pet);
    }

    public PetManager getPetManager(){
        return this.petManager;
    }

    public Pet[] getPets(){

        return this.petManager.getPets();
    }
}
