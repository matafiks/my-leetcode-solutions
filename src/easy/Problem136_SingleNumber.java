package easy;

import java.util.HashMap;
import java.util.Map;

public class Problem136_SingleNumber {

    // TODO: finish
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            map.merge(nums[i], 1, Integer::sum);
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i],1);
//            } else {
//                map.put(nums[i], 1, Integer::sum);
//            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber(new int[] {1}));
    }
}
