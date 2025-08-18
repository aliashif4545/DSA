package StringPractice;

public class MergeStringAlternate {

    public static String merge(String str1,String str2)
    {
       String result ="";
        for (int i = 0; i < str1.length() || i < str2.length(); i++) {

            if(i<str1.length())
            {
                result += str1.charAt(i);
            }
            if (i<str2.length())
            {
               result+= str2.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        String str1 = "abccd";
        String str2 = "efgh";
        System.out.println(merge(str1,str2));
    }
}
