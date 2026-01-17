package ak.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNonDuplicateMap {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        boolean result = DuplicateNonDuplicateMap.containsDuplicate1(myList.toArray(Integer[]::new));
        System.out.println(result);

        boolean result2 = DuplicateNonDuplicateMap.containsDuplicate2(myList.toArray(Integer[]::new));
        System.out.println(result2);
    }
    public static boolean containsDuplicate1(Integer[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if (set.size() == list.size()) {
            return false;
        }
        return true;
    }

    public static boolean containsDuplicate2(Integer[] nums) {
        /* or can also try below way */
        Set<Integer> setData = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num -> !setData.add(num));
    }


}
