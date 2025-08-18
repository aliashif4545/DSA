package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,4,7,2,45,22,11);
       List<Integer> sorted= list.stream().sorted().toList();
       System.out.println(sorted);
      List<Integer>reverseSorted= list.stream().sorted(Comparator.reverseOrder()).toList();
      System.out.println(reverseSorted);
    }
}
