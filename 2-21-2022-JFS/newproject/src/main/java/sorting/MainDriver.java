package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(32);
        numbers.add(12);
        numbers.add(78);
        numbers.add(8);


        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
