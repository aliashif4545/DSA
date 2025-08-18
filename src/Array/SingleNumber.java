package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        for(int i =1 ;i<nums.length-1; i++)
        {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];

    }

    public static int returnSingleNumber(int[] arr)
    {
 int val =0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if (entry.getValue()==1)
            {
                val = entry.getKey();
            }
        }
        return val;
    }

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{-1,-1,-2}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));

        System.out.println(returnSingleNumber(new int[]{-1,-1,-2}));
        System.out.println(returnSingleNumber(new int[]{4,1,2,1,2}));
    }
}
