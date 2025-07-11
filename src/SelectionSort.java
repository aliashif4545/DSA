public class SelectionSort {

public static int[] sort(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
        int smallest = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[smallest]>arr[j])
            {
                smallest=j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i]=temp;
    }
    return  arr;
}
    public static void main(String[] args) {

        int arr[] = {7,8,1,3,2,5,5};

        int [] sort = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sort[i] +"\t");
        }
    }
}
