package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class FindNonReapetingChar {


    public static char FindChar(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch: s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return '\0';

    }

    public static void main(String[] args) {

        String s = "swiss";

        System.out.println(FindChar(s));
    }
}
