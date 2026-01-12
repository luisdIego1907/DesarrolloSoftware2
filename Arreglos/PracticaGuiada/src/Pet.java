public class Pet {

    private String petName;
    private String type;

    public Pet(){

    }

    public Pet(String petName , String type){
        this.petName = petName;
        this.type = type;
    }

    public void setName(String petName){
        this.petName = petName;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return petName;
    }

    public String getType(){
        return type;
    }


}
