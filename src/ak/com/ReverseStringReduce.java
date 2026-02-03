package ak.com;

import java.util.stream.Stream;

public class ReverseStringReduce {
    public static void main(String[] args) {
        String str = "happy weekend";
        String reverseString = Stream.of(str.split(""))
                .reduce("",(a,b)->b+a);
        System.out.println(reverseString);
    }
}
