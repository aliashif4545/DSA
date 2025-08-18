package StringPractice;

public class ReverseString {

    public static String reverse(String s)
    {
        String[] word = s.split(" ");
        String  reverse= "";

        for (int i = word.length-1; i >=0; i--) {
            reverse = reverse+word[i]+" ";
        }
        return reverse;

    }

    public static void main(String[] args) {

        String s = "I love Java";
        System.out.println(reverse(s));


    }

}
