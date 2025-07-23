package Array;

public class RightRotationByKPostion {

    public static int[] rotateRight(int []arr, int postion)
    {
        int temp[] = new int[arr.length];
        int index=0;
        for (int i = 0; i < postion ; i++) {

            temp[index++] = arr[arr.length-postion+i];
        }
        for (int i = 0; i < arr.length-postion; i++) {
         temp[index++] = arr[i];
        }

        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int position = 2;
        int[] temp = rotateRight(arr,position);
        for (int i = 0; i < temp.length; i++) {

            System.out.println(temp[i] +"\t");
        }

    }
}
