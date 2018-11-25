package ro.ing.devschool;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Foreach {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(Collectors.toList());

        /**
         * For each
         */
        // 1: using "numbers" as input, print first ten numbers
        example(numbers);
        // 2: using "numbers" as input print first ten odd numbers
        printOddNumbers(numbers);
        // 3: using "numbers" as input print first ten even numbers
        printEvenNumbers(numbers);
        // 4: implement 1, 2, 3 using one method
        perfect(numbers, n -> true);
        perfect(numbers, n -> n % 2 != 0 );
        perfect(numbers, n -> n % 2 == 0 );
    }

    //1
    private static void example(List<Integer> numbers) {
        numbers.stream()
                .limit(10)
                .forEach(System.out::print);
    }

    //2
    private static void printOddNumbers(List<Integer> numbers) {
        System.out.println();
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .limit(10)
                .forEach(System.out::print);
    }

    //3
    private static void printEvenNumbers(List<Integer> numbers) {
        System.out.println();
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .limit(10)
                .forEach(System.out::print);
    }

    //4
    private static void perfect(List<Integer> numbers, Predicate<Integer> predicate) {
        System.out.println();
        numbers.stream()
                .filter(predicate)
                .limit(10)
                .forEach(System.out::print);
    }

}
