package StringPractice;

public class CountLetter {


    public static int[] Count(String str)
    {

        String s = "banana";
        int[] c = new int[26];

        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        return c;
    }
    public static void main(String[] args) {

 String str = "banana";
 int [] c = Count(str);
        System.out.println("Count of 'a': " + c[0]); // c[0] → 'a'
        System.out.println("Count of 'b': " + c[1]); // c[1] → 'b'
        System.out.println("Count of 'n': " + c['n' - 'a']);
    }
}
