package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //filter
        List<Integer> evens = list.stream().filter(integer -> integer % 2 == 0).toList();

        //map
        List<Integer> squares = list.stream().map(integer -> integer * integer).toList();

        System.out.println("EVENS : " + evens);
        System.out.println("SQUARES : " + squares);
    }
}
