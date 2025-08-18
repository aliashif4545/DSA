package Array;

public class LargestSum_KadaneAlgo {

    public static int LargestSum(int []arr)
    {
        int curSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            curSum =Math.max(arr[i],arr[i]+curSum);
            maxSum = Math.max(maxSum,curSum);


        }

        return maxSum;

    }


    public static void main(String[] args) {

        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};

        int maxSum =LargestSum(arr);
        System.out.println("Max Sum = " + maxSum);
    }
}
