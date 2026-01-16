package ak.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count =  myList.stream()
                .count();
        System.out.println(count);
        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
        int[] arr = {10,15,8,49,25,98,98,32,15};
        List<Integer> array = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count2= array.stream().count();
        System.out.println(count2);

        //Max No
        int maxNo = myList.stream().max(Integer::compare).get();
        System.out.println("MAX No:"+maxNo);

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
        int maxdata = Arrays.stream(arr).boxed()
                .max(Comparator.naturalOrder()).get();

        System.out.println(maxdata);

        //Min No
        int minNo = myList.stream().min(Integer::compare).get();
        System.out.println("MIN No:"+minNo);
    }
}
