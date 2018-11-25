package ro.ing.devschool;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mixed {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        /**
         * Mixed map/filter/reduce
         */
        // 10. using "numbers" calculate the sum of the double of even numbers
        sumDoubleEven(numbers);
        // 11. using "numbers" calculate the sum of the triple of odd numbers
        sumTripleOdd(numbers);
        // 12. using "numbers" calculate the sum of their half (1/2)
        sumOfHalf(numbers);
        // 13 implement 10, 11, 12 using one method
        perfect(numbers,
                e -> e % 2 == 0,
                n -> (double)n * 2);
        perfect(numbers,
                e -> e % 2 != 0,
                n -> (double)n * 3);
        perfect(numbers,
                e -> true,
                n -> (double)n / 2);
    }

    //10
    public static void sumDoubleEven(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .reduce(0, (acc, e) -> acc + e)
        );
    }

    //11
    public static void sumTripleOdd(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 != 0)
                        .map(n ->(double) n * 3)
                        .reduce(0d, (acc, e) -> acc + e)
        );
    }

    //12
    public static void sumOfHalf(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .map(n ->(double) n / 2)
                        .reduce(0d, (acc, e) -> acc + e)
        );
    }

    //13
    public static void perfect(List<Integer> numbers,
                               Predicate<Integer> predicate,
                               Function<Integer,Double> mapper) {
        System.out.println(
                numbers.stream()
                        .filter(predicate)
                        .map(mapper)
                        .reduce(0d, (acc, e) -> acc + e)
        );
    }
}
