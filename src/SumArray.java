import java.util.Scanner;

public class SumArray {

public static int sum(int arr[])
{
    int sum =0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum+arr[i];
    }
    return sum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter arrey element");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        int sum = sum(arr);
        System.out.println("sum = " + sum);

    }
}
