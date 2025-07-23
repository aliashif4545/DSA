package Array;

import java.util.Scanner;

public class removeduplicate {

    public static int RemoveDuplicate(int arr[])
    {
        int index =1;
        //int temp[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1])
            {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");
         int size = sc.nextInt();

         System.out.println("Enter array element");

         int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        int newsize = RemoveDuplicate(arr);
        for (int i = 0; i < newsize; i++) {
            System.out.println(arr[i]);
        }
    }
}
