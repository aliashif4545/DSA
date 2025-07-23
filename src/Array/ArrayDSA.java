package Array;

import java.util.Scanner;

public class ArrayDSA {

    /*public static void reverseArray(int arr[])
    {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        
    }*/

    public static int[] reverseArray(int arr[])
    {
        int temp[] = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
           temp[temp.length-i-1] = arr[i];
        }
        return temp;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[]= new int[size];

        System.out.println("enter the array element");
        for(int i =0; i<size; i++)
        {
           arr[i] = sc.nextInt();
        }
        int [] rev =reverseArray(arr);
        for (int value:rev)
        {
            System.out.println(value + "\t");
        }
    }
}
