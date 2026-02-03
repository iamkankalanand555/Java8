package ak.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListsRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,5,7,9);
        List<Integer> list2 = Arrays.asList(6,8,4,0,5);
        List<Integer> result =
                Stream.concat(list1.stream(),list2.stream())
                        .distinct()
                        .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
