package easy;

import java.util.*;

public class Problem387_FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s){

        String[] characters = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String letters : characters) {
            map.merge(letters, 1, Integer::sum);
        }

        for (int i = 0; i < characters.length; i++) {
            if (map.containsKey(characters[i]) && map.get(characters[i]) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
