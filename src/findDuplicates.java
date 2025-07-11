import java.util.ArrayList;
import java.util.List;

public class findDuplicates {

    public static ArrayList<Integer> duplicate(int arr[])
    {
        int index =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == arr[i+1]) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int arr[] = {1,3,4,2,2,3,3};

        List<Integer> duplcate = duplicate(arr);
        for (int x: duplcate)
        {
            System.out.print(x + "\t");
        }
        System.out.println("Duplicate Element : " + duplcate);
    }
}
