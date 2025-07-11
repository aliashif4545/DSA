import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumProduct {

    public static int maxProduct(int []arr)
    {
        int a = arr[0];
        int b = arr[1];
       int product = 0;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]*arr[j] > a*b) {
                   product=arr[i]*arr[j];
                   a = arr[i];
                   b=arr[j];
                }
            }
        }
        System.out.println("Index of the product element :" + a + "  " +  b);

        return product;
    }


    public static int maxproduct1(int []arr)
    {
        Arrays.sort(arr);
        int a;
        int b;
        int sum1 = arr[0]*arr[1];
        int sum2 = arr[arr.length-1]* arr[arr.length-2];

        if(sum1>sum2)
        {
            a = arr[0];
            b = arr[1];
        }
        else {
            a = arr[arr.length-1];
            b = arr[arr.length-2];
        }
        System.out.println("Index of the product element :" + a + "  " +  b);
        return a*b;
    }
    public static void main(String[] args) {

        int []arr = {1,4,60,2,30};

        System.out.println(maxproduct1(arr));
        System.out.println(maxProduct(arr));

    }
}
