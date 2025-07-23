package Recursion;

public class StringPermutation {

    public static void Printpermutation(String str, String permutation)
    {
        if(str.length()==0)
        {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            //System.out.println("sub string 1: " + str.substring(0,i));
            //System.out.println("sub string 2: " + str.substring(i+1));
            Printpermutation(newStr,permutation+currchar);

        }

    }

    public static void main(String[] args) {
        Printpermutation("abc","");
    }
}
