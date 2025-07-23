package Array;

public class LargestSum_KadaneAlgo {

    public static int LargestSum(int []arr)
    {
        int curSum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            curSum +=arr[i];
            maxSum = Math.max(maxSum,curSum);
            if(curSum<0)
            {
                curSum=0;
            }

        }

        return maxSum;


    }


    public static void main(String[] args) {

        int arr[] ={-2,-3, 4,-1,-2, 1, 5, -3};

        int maxSum =LargestSum(arr);
        System.out.println("Max Sum = " + maxSum);
    }
}
