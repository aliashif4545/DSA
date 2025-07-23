package Recursion;

public class SubsequencesOFString {

    public static void SubSequence(String str, int index, String newStr)
    {
        if (index==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        SubSequence(str,index+1,newStr+currChar);
        SubSequence(str,index+1,newStr);

    }
    public static void main(String[] args) {
String str = "abc";
SubSequence(str,0,"");
    }
}
