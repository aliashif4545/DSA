package Recursion;


public class TowerofHonoi {
    public static void printHanoi(int n, String src,String help, String dest)
    {
        if (n==1)
        {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        printHanoi(n-1,src,dest,help);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        printHanoi(n-1,help,src,dest);

    }

    public static void main(String[] args) {
     int n=3;
     printHanoi(n,"S","H","D");
    }
}
