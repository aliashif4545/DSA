package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,6);
        List<Integer> multipliedList = new ArrayList<>();

        multipliedList =list.stream().map(e->e*3).collect(Collectors.toList());
        System.out.println(multipliedList);

    }
}
