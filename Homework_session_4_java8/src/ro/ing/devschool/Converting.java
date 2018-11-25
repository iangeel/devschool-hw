package ro.ing.devschool;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Converting {
    public static void main(String[] args) {

        List<Integer> numbers = IntStream.range(0, 1_000)
                .boxed()
                .collect(toList());

        /**
         * Converting to java 8
         */
        // 20. convert the following code to java 8
        nonJava8Method(numbers);
        java8Method(numbers);
    }

    private static void nonJava8Method(List<Integer> numbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = 0;

            if (numbers.get(i) % 2 == 0) {
                num = numbers.get(i) + 5;
            } else {
                sum += 0;
                continue;
            }

            num = num * 7;
            if (num % 20 == 3) {
                num = num / 20;
            }

            sum += (num / 10);

            if (++counter > 5) {
                break;
            }
        }

        System.out.println(sum);
    }

    public static void java8Method(List<Integer> numbers) {

        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .limit(6)
                .map(n -> (n + 5) * 7)
                .map(n -> n % 20 == 3 ? n / 20 : n)
                .map(n -> n / 10)
                .reduce(0, (acc, e) -> acc + e)
        );

    }
}
