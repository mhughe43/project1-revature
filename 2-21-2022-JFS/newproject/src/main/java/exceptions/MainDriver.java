package exceptions;

public class MainDriver {
    public static void main(String[] args) {

        //throwCheckedException();
        throwUncheckedException();
    }

    public static void  throwCheckedException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("finally block will always run here"); //optional
        }

    }

    public static void  throwUncheckedException(){
        throw new RuntimeException();

    }


}
