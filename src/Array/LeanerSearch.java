package Array;

public class LeanerSearch {

    public static int leanerSearch(int []arr, int target)
    {
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int arr[] = {12,11,34,45,23,11};
        int target = 34;
        System.out.println(leanerSearch(arr,target));
    }
}
