package Array;

public class RotateLeftOrRight {


    public static void reverse(int []arr,int start,int end)
    {
       while(start<end)
       {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
    public static void rotate(int arr[], int k)
    {
        /*reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0, arr.length-1);*/

        reverse(arr,0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr,0, arr.length-1);


    }


    public static void main(String[] args) {

        int arr[] = {12,11,23,24,45,1,3,6};
        int position = 2;
        rotate(arr,position);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
            System.out.println();
        }



    }
}
