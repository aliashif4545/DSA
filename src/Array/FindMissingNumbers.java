package Array;

public class FindMissingNumbers {
    public static void main(String[] args) {

        int[] arr = {7,2,5,3,5,3};
        int[] brr = {7,2,5,4,6,3,5,3};
        int[] result = new int[brr.length- arr.length];
        int index = 0;
        for (int i = 0; i < Math.min(arr.length, brr.length); i++) {
         if(arr[i]!=brr[i])
         {
             result[index++] = brr[i];
         }
        }

        for (int i: result)
        {
            System.out.println(i);
        }
    }
}
