package ak.com;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        List<Integer> duplicateList = myList.stream()
                .filter(n -> !set.add(n))
                .collect(Collectors.toList());

        Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
        Set<Integer> duplicatedNumbersSet = myList.stream()
                .filter(n -> !duplicatedNumbersRemovedSet.add(n))
                .collect(Collectors.toSet());

        Iterator iter = duplicatedNumbersSet.iterator();
        while (iter.hasNext()) {
            System.out.println("Duplicates:"+iter.next());


        }


    }
}
