package Array;

public class TallestBirthdayCandle {

    public static int Candles(int[] arr)
    {
        int count=0;
        int max= 0;
        for (int i :arr)
        {
            if(i>max)
            {
                max=i;
            }
        }

        for (int i : arr)
        {
            if(i==max){
                count++;
            }
        }
        System.out.println("Max = " + max);
        return count;
    }
    public static void main(String[] args) {
     int[] arr = {4,1,2,4,3,2,4};
     
     System.out.println(Candles(arr));
    }
}
