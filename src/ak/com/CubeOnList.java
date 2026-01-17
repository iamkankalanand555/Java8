package ak.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOnList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        List<Integer> integerList2 =integerList.stream().map(i->i*i*i)
                //.filter(i->i>50)
                .collect(Collectors.toList());
        for (Integer l:integerList2) {
            System.out.println(l);
        }

    }
}
