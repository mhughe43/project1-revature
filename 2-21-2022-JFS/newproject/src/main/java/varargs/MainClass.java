package varargs;

public class MainClass {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println(calc.varArgsAdd(1, 2, 3));
    }
}
