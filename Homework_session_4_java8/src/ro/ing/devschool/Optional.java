package ro.ing.devschool;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Optional {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        /**
         * Optional<T>
         */
        // 21. using "numbers" as input print the first
        // odd number that can be divided by 121, if it does not exist print -1

        optional(numbers);
    }


    public static void optional(List<Integer> numbers) {
                numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .filter(n -> n % 121 == 0)
                    .findFirst().ifPresentOrElse(n -> System.out.println(n),
                        () -> System.out.println("-1"));

    }


}
