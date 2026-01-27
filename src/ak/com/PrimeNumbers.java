package ak.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumbers {
    public static boolean isPrime(int i) {
        IntPredicate isDivisible = index -> i % index == 0;
        return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
    }

    public static boolean isPrimeNum(long number) {
        return number>1
                && LongStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args)
    {

        //System.out.println(printPrime(200));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20,23);
        // Prime number
        System.out.println(numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .collect(Collectors.toList()));
    }
}
