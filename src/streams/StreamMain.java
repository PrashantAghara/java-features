package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        getEven();
    }

    //Create a list and filter out the even elements
    static void getEven() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Simple way
        List<Integer> even1 = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0)
                even1.add(i);
        }
        System.out.println(even1);

        // Stream API
        List<Integer> even2 = list.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println(even2);
    }
}
