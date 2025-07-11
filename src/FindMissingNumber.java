public class FindMissingNumber {

    public static int missingNumber(int arr[])
    {
        int n  = arr.length+1;
        int sum = (n*(n+1))/2;

        for (int i = 0; i <arr.length ; i++) {

            sum=sum-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[] ={8,2,3,5,6,1,7};

      int number = missingNumber(arr);
      System.out.println("Missing number is : " + number);
    }
}
