package Array;

public class EvenAndOddElement {

    public static void main(String[] args) {
        int arr[] ={11,22,32,41,5,66,70,8,9};
int evenCount = 0;
int oddCount =0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0)
            {
                evenCount++;
            } else if (arr[i]%2==1) {
                oddCount++;

            }
        }

        System.out.println("EvenCount ="+ evenCount + " " + "OddCount = " + oddCount);
    }
}
