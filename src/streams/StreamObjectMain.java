package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectMain {
    public static void main(String[] args) {
        // Method 1
        Stream<Object> stream = Stream.empty();

        // Method 2
        String[] names = {"Prashant", "John"};
        Stream<String> namesStream = Stream.of(names);
        namesStream.forEach(System.out::println);

        //Method 3
        Stream<Object> streamBuilder = Stream.builder().build();

        //Method 4
        Stream<String> arrayStream = Arrays.stream(names);
        IntStream integerStream = Arrays.stream(new int[]{1,2,3,4});

        //Method 5
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream1 = list.stream();
    }
}
