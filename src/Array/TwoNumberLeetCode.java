package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberLeetCode {

    public static int[] sum(int[] arr, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int cmplement = target-arr[i];
            if(map.containsKey(cmplement))
            {
               return  new int[]{map.get(cmplement),i};
            }
           map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {

        int [] arr = {2,7,11,15};
        int target =9;
        int[] val = sum(arr,target);
        Arrays.stream(val).forEach(System.out::println);
    }
}
