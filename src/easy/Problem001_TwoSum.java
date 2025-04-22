package easy;

import java.util.HashMap;
import java.util.Map;

public class Problem001_TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // mapa to wartość z tablicy i jej indeks
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // szukamy klucza, który po odjęciu jednej wartości z targeta da nam zero
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] {i, map.get(diff)};
            }
        }

        return new int[]{};
    }
}
