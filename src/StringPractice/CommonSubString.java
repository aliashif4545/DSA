package StringPractice;

import Array.Main;

import java.util.HashSet;
import java.util.Set;

public class CommonSubString {

    public static void main(String[] args) {

        String s1 = "barbell";
        String s2 = "trapper";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (Character ch: s1.toCharArray())
        {
            set1.add(ch);
        }
        for (Character ch: s2.toCharArray())
        {
            set2.add(ch);
        }
        set1.retainAll(set2);

        System.out.println(set1);
    }
}
