package ak.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConvertObjectToUpperCase {
    public static void main(String[] args) {
        Stream<String> names = "Anand Sonpeth".lines();
        List<String> nameLst = names
                .map((String s) -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(nameLst);
    }
}
