package Array;

import java.util.Map;
import java.util.TreeMap;

public class FindMissingNumbers1 {
    public static TreeMap<Integer, Integer> missingNumber(int[] arr, int[] brr)
    {

        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        for (int i: brr)
        {
            treemap.put(i,treemap.getOrDefault(i,0)+1);
        }
        for (int i: arr)
        {
            int freq= treemap.get(i);
            freq--;
            if (freq==0) {
                treemap.remove(i);
            }
            else
                treemap.put(i,freq);
        }
        return treemap;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,5,3,5,3};
        int[] brr = {7,2,5,4,6,3,5,3};

        for (Map.Entry<Integer,Integer> entry : missingNumber(arr,brr).entrySet())
        {
            System.out.println(entry.getKey()+"..." + entry.getValue());
        }
    }
}
