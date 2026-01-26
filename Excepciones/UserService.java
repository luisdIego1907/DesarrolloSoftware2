public class UserService {

    public void registerUser(int age)  {
    
        if( age < 18 || age > 120){

            throw new InvalidAgeException ("Edad no valida");
        }else{
            System.out.println("Edad valida");
        }
    }
}
