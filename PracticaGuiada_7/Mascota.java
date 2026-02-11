public class Mascota {

     @Override
    public String toString() {
        return "Mascota [petName=" + petName + ", type=" + type + "]";
    }

     private String petName;
    private String type;

    public Mascota(){

    }

    public Mascota(String petName , String type){
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
