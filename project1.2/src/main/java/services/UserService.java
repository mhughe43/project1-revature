package services;

import models.User;
import repositories.UserDAO;
import repositories.UserDAOImp;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;

    }

    public UserService(){
        this.userDAO = new UserDAOImp();
    }

    public User validateCredentials(String username, String password){
        ///check to see if username and password is in the database
        User user = this.userDAO.getUserByUsername(username);

        if(user == null) //if user equals null return null
            return null;
        if (!password.equals(user.getPassword())) //if password doesn't equal getpassword, return null
            return null;

        return user;

    }

}
