package Array;

public class BubbleSort {

    public static int[] sort(int []arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
     int arr[] = {7,8,1,3,2};

     int [] sort = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sort[i] +"\t");
        }
    }
}
