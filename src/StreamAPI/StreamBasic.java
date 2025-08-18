package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic {

    public static void main(String[] args) {

        List<Integer> list = List.of(2,4,7,12,15,16,21,24);

        List<Integer> evenList = new ArrayList<>();

        for (Integer i: list)
        {
            if(i%2==0)
            {
                evenList.add(i);
            }
        }
        System.out.println("List : " + list);
        System.out.println("EvenLIst : " + evenList);

        // Using Stream

        Stream<Integer>stream=list.stream();
       List<Integer> newList= stream.filter(i->i%2==0).toList();
       System.out.println("NewLIst :" + newList);
       List<Integer> newList1 = list.stream().filter(i -> i>10).toList();
       System.out.println("newList1 : " + newList1);
    }
}
