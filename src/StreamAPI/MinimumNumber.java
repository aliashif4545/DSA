package StreamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumber {
    public static int  minNumber(int[] arr)
    {

        int min =Arrays.stream(arr).min().orElseThrow();

        return min;
    }
    public static int  minNumber1(int[] arr)
    {

        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
       Integer min= list.stream().min((x, y) -> x.compareTo(y)).get();
        list.stream().filter(x->x%2==0).forEach(x->System.out.println(x));

        return min;
    }

    public static void main(String[] args) {
        int [] arr = {22,33,11,4,56};

        System.out.println(minNumber(arr));
        System.out.println(minNumber1(arr));

    }
}
