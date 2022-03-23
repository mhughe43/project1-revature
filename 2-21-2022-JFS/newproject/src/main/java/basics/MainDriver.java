package basics;

public class MainDriver {
    public static void main(String[] args) {
        System.out.println("Hello from basics");
        starTree(5);
    }
        static void starTree ( int num){
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }


