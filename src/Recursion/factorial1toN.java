package Recursion;

public class factorial1toN {

    public static int fact(int n)
    {
        if(n==1||n==0) {
            return 1;
        }
        int fac =1;
        for (int i = 1; i <= n; i++) {
             fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println(fact(i));
        }
    }
}
