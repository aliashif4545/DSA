public class Largest {

    public static int maximum(int []arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int []arr = {12,11,34,55,66,44};

        int max = maximum(arr);
        System.out.println(max);

    }
}
