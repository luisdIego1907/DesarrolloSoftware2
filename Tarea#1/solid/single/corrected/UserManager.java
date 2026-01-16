package solid.single.corrected;

public class UserManager {

    private User user;
    private UserEnsureData userEnsureData;

    public UserManager(User user , UserEnsureData userEnsureData){
        this.user = user;
        this.userEnsureData = userEnsureData;
    }

    public boolean registerUser(){

        return userEnsureData.validateUsername(user.getUsername()) && userEnsureData.validatePassword(user.getPassword());
    }

    public boolean loginUser(){

        return userEnsureData.validateUsername(user.getUsername()) && userEnsureData.validatePassword(user.getPassword());
    }
}
