import java.util.Scanner;

public class secondlargestElement {

    public static int findSecondlargestElement(int arr[])
    {
        int largest = arr[0];
        int secondLargest = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest & arr[i]!=largest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        System.out.println("Enter array element");

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i]= sc.nextInt();

        }

        int secondlargest = findSecondlargestElement(arr);
        System.out.println("Second largest element : " + secondlargest);

    }
}
