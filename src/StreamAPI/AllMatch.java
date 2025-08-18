package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One Apple");
        list.add("One Banana");
        list.add("Two Grapes");
        list.add("Two Mangoes");
        boolean value =list.stream().anyMatch(v->v.startsWith("One"));
        System.out.println(value);
         value =list.stream().allMatch(v->v.startsWith("One"));
         System.out.println(value);
         value =list.stream().noneMatch(v->v.startsWith("One"));
        System.out.println(value);

    }
}
