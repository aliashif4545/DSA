package Recursion;

public class CalPower {

    public static int printpower(int x, int n)
    {
        if (n==0)
        {
            return 1;
        }
        if (x==0)
        {
            return 0;
        }
        /*int xpow = printpower(x,n-1);
        int power = x*xpow;
        return power;*/
        if(n%2==0)
        {
            return printpower(x,n/2) * printpower(x,n/2);

        }
        else
        {
            return printpower(x,n/2) * printpower(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
       System.out.println(printpower(2,7));
    }
}
