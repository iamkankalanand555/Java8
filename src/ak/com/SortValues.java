package ak.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("Natural Order List");
        List<Integer> naturalOrder = myList.stream().sorted().collect(Collectors.toList());
        System.out.println(naturalOrder);
        // myList.stream().sorted().forEach(System.out::println);

        /* Or can also try below way */
        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
        int[] arr = {10,15,8,49,25,98,98,32,15};
        List<Integer> myList2 = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
         System.out.println(myList2);

         //descending order
        System.out.println("Reverse Order List");
        List<Integer> reverseOrder = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);

        List<Integer> reverseOrder2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder2);

    }
}
