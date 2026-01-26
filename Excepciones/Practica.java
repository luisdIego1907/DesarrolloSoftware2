import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;

public class Practica {

    public static void main(String[] args) {
        
        //int variable = 10 / 0; No obliga tener try cath, unchecked

        //System.out.println(variable);

        //System.out.println("Pudo terminar");

        //recursive();

        //Exception e = new Exception();
        /* 
        try{

            FileReader reader = new FileReader("nonexistentfile");

        }catch(FileNotFoundException e){

            System.err.println("Error: " + e.getCause());
        }   
            */
/* 
        String file = null;

        if( file != null) System.out.println(file.charAt(0));

        IllegalArgumentException e;
        */


        UserService user = new UserService();

       // user.registerUser(25);

        try{
             user.registerUser(2);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }

       
    }

    public static void recursive(){

        recursive();
    }

    public void v(){

        try{

        }catch ( IllegalArgumentException e){

            System.err.println(e);

        }catch( NumberFormatExcpection a){

            System.err.println(a);
        }
    }
}
