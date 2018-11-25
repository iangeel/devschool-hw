package ro.ing.devschool;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Collectors {
    public static void main(String[] args) {
        String vowels = "aeiou";
        List<String> words = Arrays.asList("One", "Two", "three", "four", "five", "six", "seven", "Eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "Fourteen", "fifteen", "sixteen", "Nineteen", "twenty");

        /**
         * Collectors
         */
        // 14. using "words" as input print a string with each UPPERCASED word separated by ', '
        System.out.println("\n\t14.UPPERCASE");
        printUppercase(words);
        // 15. using "words" as input create a List containing all words starting with a vowel
        System.out.println("\n\t15.VOWEL");
        vowelList(words,vowels)
                .forEach(System.out::println);
        // 16. using "words" as input create a List containing all words ending in 'teen'
        System.out.println("\n\t16.TEEN");
        teenList(words)
                .forEach(System.out::println);
        // 17. implement 15 and 16 using one method
        System.out.println("\n\t17.VOWEL v2");
        teenOrVowel(words,
                v -> vowels.indexOf(Character.toLowerCase(v.charAt(0))) != -1,
                t -> true)
                .forEach(System.out::println);
        System.out.println("\n\t17.TEEN v2");
        teenOrVowel(words,
                v -> true,
                t -> t.endsWith("teen"))
                .forEach(System.out::println);
        // 18. using words as input create a Set of words with an odd number of letters
        System.out.println("\n\t18.SET for odd no of letters v2");
        oddStrings(words)
                .forEach(System.out::println);
        // 19. using words as input create a Set containing the number of letters in a word
        System.out.println("\n\t19. SET containing no of letters");
        letterNumber(words)
                .forEach(System.out::println);
    }

    //14
    public static void printUppercase(List<String> words) {
        System.out.println(
         words.stream()
                .filter(str -> Character.isUpperCase(str.charAt(0)))
                .collect(joining(", "))
        );
    }

    //15
    public static List<String> vowelList(List<String> words, String vowels) {
        return words.stream()
                    .filter(str -> vowels.indexOf(Character.toLowerCase(str.charAt(0))) != -1)
                    .collect(toList());
    }

    //16
    public static List<String> teenList(List<String> words) {
        return words.stream()
                .filter(str -> str.endsWith("teen"))
                .collect(toList());
    }

    //17
    public static List<String> teenOrVowel(List<String> words, Predicate<String> v, Predicate<String> t) {
        return words.stream()
                .filter(v)
                .filter(t)
                .collect(toList());
    }

    //18
    public static Set<String> oddStrings(List<String> words) {
        return words.stream()
                .filter(str -> str.length() % 2 != 0)
                .collect(toSet());
    }

    //19
    public static Set<Integer> letterNumber(List<String> words) {
        return words.stream()
                .map(str -> str.length())
                .collect(toSet());
    }
}
