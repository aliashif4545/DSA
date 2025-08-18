package StringPractice;



public class ReverseWord1 {
    public static void main(String[] args) {

        String s = "My name is Ashif";

        String[] words = s.split(" ");
        String reverse="";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length()-1; j >=0 ; j--) {

                reverse = reverse+words[i].charAt(j);

            }
            reverse+=" ";


               
        }
        System.out.println(reverse);
    }

}
