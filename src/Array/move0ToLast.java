package Array;

import java.util.Scanner;

public class move0ToLast {

    public static int[] move0toEnd(int arr[])
    {
        int index = 0;
        int temp[] = new int[arr.length];
        for (int  i= 0;  i< arr.length;i ++) {

            if(arr[i]!=0)
            {
                temp[index++]= arr[i];
            }
        }

        while(index< arr.length)
        {
            temp[index++]  = 0;
        }

        return temp;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size");

        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        int temp[] =move0toEnd(arr);

        for (int value:temp)
        {
            System.out.print(value + "\t");
        }
    }
}
