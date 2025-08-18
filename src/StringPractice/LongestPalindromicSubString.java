package StringPractice;

public class LongestPalindromicSubString {

    public static boolean subString(String s, int i, int j)
    {
        while(i<j)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1!=ch2)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "babad";
        int max=0;
        String logest ="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (subString(s, i, j))
                {
                    System.out.println("Palindromic Substring : " + s.substring(i,j+1));
                    if (s.substring(i,j+1).length()>logest.length())
                    {
                        logest=s.substring(i,j+1);

                    }
                    max++;

                }
            }
        }
        System.out.println("Longest SubString : "+logest);
        System.out.println("Longest SubString Length : " + logest.length());
        System.out.println("Total number of substrings : "+max);
    }
}
