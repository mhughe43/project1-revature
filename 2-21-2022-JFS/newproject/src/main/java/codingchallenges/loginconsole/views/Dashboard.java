package codingchallenges.loginconsole.views;

import codingchallenges.loginconsole.services.LoginService;

import java.util.Scanner;

public class Dashboard {

    public static void view(){
        LoginService loginService = new LoginService();
        Scanner sc = new Scanner(System.in);

        Boolean running = true;

        while(running) {
            System.out.println("WELCOME TO YOUR DASHBOARD");
            System.out.println("1) display username");
            System.out.println("0) exit");
            String input = sc.nextLine(); //what the user puts in the console

            switch (input){
                case "1":
                    System.out.println("Username is: " + loginService.USERNAME.toUpperCase());
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }

        }
    }
}
