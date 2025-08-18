package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("Car","Bike","Scooty","Car","BUS","JEEP","BUS","Bike");

        List<String> veh =vehicles.stream().distinct().toList();
        System.out.println(veh);
        vehicles.stream().distinct().forEach(e->System.out.println(e));

       long count = vehicles.stream().distinct().count();
       System.out.println(count);

       //limit
       vehicles.stream().limit(3).forEach(e->System.out.println(e));

    }
}
