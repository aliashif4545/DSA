package StringPractice;

public class MakingAnagram {


    public static int anagram(String str1,String str2)
    {

        int[] c = new int[26];
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            c[str1.charAt(i)-'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            c[str2.charAt(i)-'a']--;
        }
        int total=0;
        for (int i:c) {
         total =total+Math.abs(i);
        }
        return total;
    }

    public static void main(String[] args) {

        String s1 = "rate";
        String s2 = "tars";
       int count = anagram(s1,s2);
       System.out.println(count);

    }
}
