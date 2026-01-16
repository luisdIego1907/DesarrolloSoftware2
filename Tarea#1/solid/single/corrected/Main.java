package solid.single.corrected;

public class Main {

    public static void main(String args[]){

        User user = new User( "Luis_", "Password123");

        UserEnsureData userED = new UserEnsureData();

        UserManager manager = new UserManager(user, userED);

        System.out.println((manager.registerUser()) ? "User registered successfully" : "Invalid username or password.");

        System.out.println((manager.loginUser()) ? "User logged in successfully." : "Invalid username or password.");
    }
}
