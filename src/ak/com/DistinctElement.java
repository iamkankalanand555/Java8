package ak.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String[] args) {
        List<Integer> myList =
                Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        myList.stream().distinct()
                .forEach(noDuplicateData -> System.out.println(noDuplicateData));

        Set<Integer> set = new HashSet<>(myList);

        // Convert the set back to a list if needed
        List<Integer> uniqueData = set.stream().collect(Collectors.toList());

        // Print the unique elements
        System.out.println("After converted to Set");
        uniqueData.forEach(System.out::println);

        /* Way 3 - Gives list of all distinct/unique values */

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */

        int[] arr = {10,15,8,49,25,98,98,32,15};
        List<Integer> list = Arrays.stream(arr).boxed().distinct()
                .collect(Collectors.toList());
        System.out.println("After converted to List");
        uniqueData.forEach(System.out::println);

    }
}
