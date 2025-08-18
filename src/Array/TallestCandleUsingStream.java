package Array;

import java.util.Arrays;

public class TallestCandleUsingStream {


    public static long candles(int[] arr)
    {
       int max = Arrays.stream(arr).max().orElse(0);
        System.out.println("Max = "+max);
        return Arrays.stream(arr).filter(i -> i == max).count();
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 4, 3, 2, 4};

        System.out.println(candles(arr));
    }
}
