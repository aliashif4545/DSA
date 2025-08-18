package StringPractice;



public class ReverseWord {
    public static void main(String[] args) {

        String s = "My name is Ashif";

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {


               sb.append(words[i]).append(" ");

        }
        System.out.println(sb.reverse());
    }

}
