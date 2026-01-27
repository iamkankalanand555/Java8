package ak.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Optional<Integer> firstElement = myList.stream().findFirst();

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
        int[] arr = {10,15,8,49,25,98,98,32,15};
        Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
        //find last
        // Get the first element of the reversed stream
        Integer firstElementOfReversedStream = myList.stream()
                .sorted(Collections.reverseOrder())
                .findFirst()
                .orElse(null);
        // Handle the case where the stream might be empty
        System.out.println(" \n First element of the reversed stream: " + firstElementOfReversedStream);

        Stream<String> stream
                = Stream.of("Geek_First", "Geek_2",
                "Geek_3", "Geek_4",
                "Geek_Last");

        int N = 9;
        // Print the last element of a Stream
        System.out.println(
                "Last Element: "
                        + lastElementInStream(myList.stream(), N));
    }
    public static <T> T lastElementInStream(Stream<T> stream, int N)
    {
        T last_element
                = stream
                // This returns a stream after
                // removing first N-1 elements
                // resultant stream will contain
                // only single element
                .skip(N - 1)
                // findFirst() method return
                // the first element of
                // newly generated stream
                .findFirst()
                // if stream is empty
                // null is returned
                .orElse(null);
        return last_element;
    }

}
