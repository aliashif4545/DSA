package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccuerence {

    public static void main(String[] args) {
        String str = "programming";

        Map<Object, Long> map=str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        map.entrySet().stream().forEach(entry->System.out.println(entry.getValue() + "::" + entry.getKey()));
    }
}
