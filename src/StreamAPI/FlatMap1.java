package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Ashif","Ali");
        List<String> list2 = Arrays.asList("AYesha","Khan");
        List<String> list3 = Arrays.asList("Duaa","Fatima");

        List<List<String>> finalList = new ArrayList<List<String>>();
        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);

        System.out.println(finalList);
        //Before Java 8
        for (List<String> names: finalList)
        {
            for (String str : names) {
                System.out.println( str);
            }
        }
        for (int i = 0; i < finalList.size(); i++) {
            for (int j = 0; j < finalList.get(i).size(); j++) {


                System.out.println(finalList.get(i).get(j));
            }
        }

        //Using stream
        List<String> result =finalList.stream().flatMap(list->list.stream()).toList();
        System.out.println(result);


    }
}
