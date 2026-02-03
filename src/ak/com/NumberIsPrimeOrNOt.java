package ak.com;

import java.util.stream.IntStream;

public class NumberIsPrimeOrNOt {
    public static void main(String[] args) {
        int num=7;
        boolean flag =
                IntStream.rangeClosed(2,(int)
                         Math.sqrt(num))
                        .noneMatch(i->num % i == 0);
        System.out.println(flag);
    }
}
