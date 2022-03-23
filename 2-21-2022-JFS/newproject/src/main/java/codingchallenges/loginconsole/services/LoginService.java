package codingchallenges.loginconsole.services;

import kotlin.jvm.internal.Ref;

public class LoginService {
    public final String USERNAME= "user123";
    public final String PASSWORD="fluffybunny";

    public Boolean validateCredentials(String username, String password){

        return USERNAME.equals(username) && PASSWORD.equals(password);

    }


}
