package Recursion;

public class Fibonacci {

    public static void printfibonacci(int a, int b, int n)
    {
        if (n==0)
        {
            return;
        }
          int c = a+b;
          System.out.print(","+c);
          printfibonacci(b,c,n-1);
    }

    public static void main(String[] args) {

        int a =0,  b=1, n = 10;
        System.out.print(a + "," + b );
        printfibonacci(a,b,n-2);
    }
}
