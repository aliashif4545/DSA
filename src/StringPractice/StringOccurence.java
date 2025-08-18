package StringPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringOccurence {

    public static Map<Character,Integer> printOccurance(String str)
    {
        Map<Character, Integer> countChar = new HashMap<>();

        for (Character ch : str.toCharArray())
        {
            countChar.put(ch,countChar.getOrDefault(ch,0)+1);
        }
        return countChar;
    }
    public static Map<Character,Integer> Occurance(String str)
    {
        Map<Character, Integer> countChar = new HashMap<>();

        for (Character ch : str.toCharArray())
        {
            if (!countChar.containsKey(ch))
            {
                countChar.put(ch,0);
            }
            else
            {
                countChar.put(ch,countChar.get(ch) +1);
            }

        }
        return countChar;
    }

    public static void main(String[] args) {

        String str = "programming";


        System.out.println("Print Occurence : ");
        for (Map.Entry<Character,Integer> entry:printOccurance(str).entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Print Occurence : ");
        for (Map.Entry<Character,Integer> entry1:Occurance(str).entrySet())
        {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }
    }
}
