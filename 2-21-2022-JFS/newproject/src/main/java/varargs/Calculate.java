package varargs;

public class Calculate {
    public int varArgsAdd(int ...x){
        int sum = 0;
        for(int val : x){
            sum = sum + val;
        }

        return sum;

    }
}
