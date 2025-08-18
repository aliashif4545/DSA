package StringPractice;

public class ReverseSubString {

    public static  void main(String[] args) {
        String s = "HelloWorld";
        
        char[] c = s.toCharArray();
        int i =2;
        int j=6;
        while(j>i)
        {
            char temp = c[i];
            c[i]= c[j];
            c[j] = temp;
            i++;
            j--;
        }
        System.out.println(c);
        
    }
}
