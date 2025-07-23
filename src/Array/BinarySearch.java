package Array;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int []arr, int target)
    {
        int low =0;
        int high = arr.length-1;
        while(low<=high)
        {
            int midIndex= low+(high-low)/2;
            if(arr[midIndex]==target)
            {
                return midIndex;
            }
            if(target<arr[midIndex])
            {
                high=midIndex-1;
            }
            if (target>arr[midIndex])
            {
                low = midIndex+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int []arr = {5,8,12,15,22,30,40};
        Arrays.sort(arr);
        int target = 12;
        System.out.println(binarySearch(arr,target));
    }
}
