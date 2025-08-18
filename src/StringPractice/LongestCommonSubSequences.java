package StringPractice;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubSequences {

    static int[][] dp;
    public static int solve(String s1, String s2)
    {
         dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 1; i <=s1.length() ; i++) {
            for (int j = 1; j <=s2.length() ; j++) {

                if (s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] =1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }



        return dp[s1.length()][s2.length()];
    }

    public static String returnString(String s1, String s2)
    {
        int i = s1.length();
        int j = s2.length();
        StringBuilder lcs = new StringBuilder();

        while (i>0&&j>0)
        {
            if (s1.charAt(i-1)==s2.charAt(j-1))
            {
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                i--;
            }
            else {
                j--;
            }
        }
        return lcs.reverse().toString();
    }


    public static void main(String[] args) {

        String s1 = "ABCBDAB";
        String  s2 = "BDCAB";

        List<Character> list1= new ArrayList<>();
        List<Character> list2= new ArrayList<>();
        for (char c :s1.toCharArray())
        {
            list1.add(c);
        }
        for (char c :s2.toCharArray())
        {
            list2.add(c);
        }
        list2.retainAll(list1);
        System.out.println(list2);
        //int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        System.out.println(solve(s1,s2));
        System.out.println(returnString(s1,s2));
    }
}
