package ak.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumbersFromList {
    public static void main(String[] args) {
        //find out even number from array
        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; */
        int[] arr = {10,15,8,49,25,98,32};
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> evenNumbers=
                list.stream().filter(f -> f%2==0)
                        .collect(Collectors.toList());
        for (Integer evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }

        //other way
        Map<Boolean, List<Integer>> mapList = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println(mapList);
    }
}
