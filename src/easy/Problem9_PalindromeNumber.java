package easy;

public class Problem9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] num = number.toCharArray();

        for (int i = 0; i < num.length/2; i++) {
            if(num[i] != num[num.length - i - 1]) return false;
        }
        return true;
    }
}
