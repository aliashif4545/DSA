package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class WordOccurance {

    public static void main(String[] args) {
         String str = "Java is a programming language and Java is also an island";
        Map<String,Integer> count = new HashMap<>();
        for (String word: str.split("\\s"))
        {
            count.put(word, count.getOrDefault(word,0)+1);
        }

        for (Map.Entry<String,Integer> entry : count.entrySet())
        {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }
}
