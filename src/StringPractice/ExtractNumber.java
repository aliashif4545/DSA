package StringPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractNumber {

    public static void main(String[] args) {
       // XX11YY4321- TRUE
       // XX31Y1234  - TRUE

        String s= "XXUUYY432A";

        System.out.println(s.substring(6,s.length()-1));//


        StringBuilder bl = new StringBuilder();
        for (char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                bl.append(c);
            }
        }
        System.out.println(bl);

         System.out.println(s.replaceAll("[^\\d]",""));



       String result= s.chars().filter(c->Character.isDigit(c)).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
       System.out.println(result);


    }
}
