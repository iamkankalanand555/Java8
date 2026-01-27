package ak.com;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListToMap {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

        LinkedHashMap<Integer, String>
                map = noteLst.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Notes::getTagId,
                                        Notes::getNoteName,
                                        (x, y)
                                                -> x + ", " + y,
                                        LinkedHashMap::new));
    }
}
