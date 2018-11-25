package ro.ing.devschool;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sums {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        /**
         * Sums
         */
        // 5. using "numbers" as input print their sum
        simpleSum(numbers);
        // 6. using "numbers" as input print the sum of the odd numbers
        oddSum(numbers);
        // 7. using "numbers" as input print the sum of the even numbers
        evenSum(numbers);
        // 8. using "numbers" as input print the sum of the even numbers which contain '7'
        evenSumWith7(numbers);
        // 9. implement 5, 6, 7, 8 using one method
        perfectSum(numbers, p -> true, e -> true);
        perfectSum(numbers, p -> p % 2 != 0, e -> true);
        perfectSum(numbers, p -> p % 2 == 0, e -> true);
        perfectSum(numbers,
                p -> p % 2 == 0,
                e -> String.valueOf(e).contains("7"));
    }

    //5
    public static void simpleSum(List<Integer> numbers) {
        System.out.println(
            numbers.stream()
                    .reduce(0, (acc, n) -> acc + n)
        );
    }

    //6
    public static void oddSum(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 != 0)
                        .reduce(0, (acc, n) -> acc + n)
        );
    }

    //7
    public static void evenSum(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .reduce(0, (acc, n) -> acc + n)
        );
    }

    //8
    public static void evenSumWith7(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .filter(n -> String.valueOf(n).contains("7"))
                        .reduce(0, (acc, n) -> acc + n)
        );
    }

    //9
    public static void perfectSum(List<Integer> numbers,
                                  Predicate<Integer> p,
                                  Predicate<Integer> e) {
        System.out.println(
                numbers.stream()
                        .filter(p)
                        .filter(e)
                        .reduce(0, (acc, n) -> acc + n)
        );
    }

}
