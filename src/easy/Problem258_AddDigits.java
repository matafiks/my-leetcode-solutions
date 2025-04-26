package easy;

import java.util.Arrays;

public class Problem258_AddDigits {

    public static int addDigits(int num) {

        // convert int to String
        String number = String.valueOf(num);
        while(true) {
            // create an array of single character numbers
            int[] nums = new int[number.length()];

            for (int i = 0; i < number.length(); i++) {
                nums[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            // sum all numbers within array
            int sum = 0;
            for (int numbers : nums) {
                sum+= numbers;
            }
            // if sum < 10 return sum
            if (sum < 10) {
                return sum;
            }
            // else, start over with new number as String number
            number = String.valueOf(sum);
        }
    }

    // far better solution from leetcode
    /*public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        return((num % 9 == 0)? 9 : num % 9);
    }*/

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
