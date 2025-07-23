package Array;

public class LeftRotateByKPostion {

    public static int[] rotateLeft(int arr[], int Position)
    {
        int [] temp = new int[arr.length];
        int index =0;
        for (int i = Position; i < arr.length; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < Position; i++) {
            temp[index++] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int postion =2;
        int arr[] = {5,4,11,12,3,7,8};

        int[] temp = rotateLeft(arr,postion);
        for (int i = 0; i < temp.length; i++) {

            System.out.println(temp[i] +"\t");
        }
    }
}
