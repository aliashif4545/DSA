import java.util.Scanner;

public class ArrayOccurenece {

    public static int findOccurenec(int[] arr, int target)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter array size");

        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array element ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter target element ");
        int target = sc.nextInt();

        int count = findOccurenec(arr,target);
        System.out.println("count : " + count);
    }
}
