package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem2351_FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue().equals(2)) {
                    return (char) entry.getKey();
                }
            }
        }

        return 'x';
    }

    // better solution found on LeetCode (mine is still working properly but slow)

    /*public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet();
        for (char c : s.toCharArray())
            if (!set.add(c))
                return c;

        return 'a';// can't reach to this line, because there must be a letter appearing TWICE
    }*/

    public static void main(String[] args) {

        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));

    }
}
