package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MIn {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,2,5,12,89,34);

       long count= list.stream().filter(x->x%2==0).count();
       System.out.println(count);
        int min=list.stream().min((v1,v2)->v1.compareTo(v2)).get();
        System.out.println(min);

        List<String> list2 = Arrays.asList("A","B","C","1","2","3");
        Optional<String>reduce=list2.stream().reduce((v1, v2)->v1+v2);
        System.out.println(reduce.get());
    }
}
