package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 1, 2);

        Optional<Integer> num=numbers.stream().findAny();
        System.out.println(num.get());

//find First
        num = numbers.stream().skip(1).findFirst();
        System.out.println(num.get());
    }
}
