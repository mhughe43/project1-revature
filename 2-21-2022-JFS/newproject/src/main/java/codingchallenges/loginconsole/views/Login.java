package codingchallenges.loginconsole.views;
import codingchallenges.loginconsole.services.LoginService;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Login {


    public static void view(){
        LoginService loginService = new LoginService();
        Dashboard dashboard = new Dashboard();

        Boolean running=true;

        while(running) {

            Scanner sc = new Scanner(System.in);
            System.out.println("LOGIN PAGE!!!!");

            //retrieve username
            System.out.println("Username: ");
            String username = sc.nextLine(); //grabs the entire line with no regard to spaces


            //retrieve password
            System.out.println("Password: ");
            String password = sc.nextLine();

            if(loginService.validateCredentials(username, password)) {
                Dashboard.view();
            }else{
                System.out.println("INVALID CREDENTIALS >:( ");
            }
        }

    }
}
