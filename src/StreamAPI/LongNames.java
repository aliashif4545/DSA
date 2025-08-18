package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongNames {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("AshifAli","Ashiayana","Duaa","Agra");


        List<String> longNames = new ArrayList<>();

       longNames= names.stream().filter(str->str.length()>6 && str.length()<=8).collect(Collectors.toList());
       System.out.println(longNames);
        names.stream().filter(str->str.length()>6 && str.length()<=8).forEach(System.out::println);
         names.stream().map(str->str.length()).forEach(System.out::println);
          names.stream().map(String::toUpperCase).forEach(System.out::println);
        List<String> list = Arrays.asList("AshifAli","Ashiayana","Duaa","Agra",null,"sasd",null);
        list.stream().filter(w->w!=null).forEach(e->System.out.println(e));

    }
}
