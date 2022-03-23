package repositories;

import models.User;

public interface UserDAO {
    User getUserByUsername(String expectedUsername);

}