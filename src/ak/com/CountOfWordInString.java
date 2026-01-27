package ak.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWordInString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC","CC");
        Map<String,Long> map =
                names.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );
        System.out.println(map);
        Map<String,Long> namesCount = names
                .stream()
                .filter(x-> Collections.frequency(names, x)>1)//filter only duplicate
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

        Map<String, Long> namesCount2 = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(namesCount2);

        Optional.ofNullable(names)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                //.map(note -> Notes::getTagName) // method reference, consider only tag name
                .forEach(System.out::println); // it will print tag names
    }
}
