package services;

import models.User;
import repository.UserDAO;
import repository.UserDAOImpl;

public class UserService {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    };

    public UserService(){
        this.userDAO = new UserDAOImpl();
    }


    public User validateCredentials(String username, String password){
        User user = this.userDAO.getUserGivenUsername(username);

        //user wasn't found, return null
        if(user == null)
            return null;

        if(!password.equals(user.getPassword()))
            return null;

        return user;

    }

    public void createUser(User user) {
        this.userDAO.createUser(user);
    }

}
