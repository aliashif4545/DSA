package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        String []names = {"Ashif","Duaa","Ayesha","Ali"};
        Stream<String> stream = Stream.of(names);

        /*stream.forEach(e->{
            System.out.println(e);
        });
*/
        List<String> list =stream.filter(e->e.startsWith("A")).toList();
        System.out.println(list);
        Arrays.stream(names).sorted().forEach(System.out::println);
        Arrays.stream(names).forEach(e->
        {System.out.println(e);});
    }
}
