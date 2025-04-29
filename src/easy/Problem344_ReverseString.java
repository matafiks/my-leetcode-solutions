package easy;

public class Problem344_ReverseString {

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            int first = s[i];
            int last = s[s.length - i - 1];

            s[s.length - i - 1] = (char) first;
            s[i] = (char) last;
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a', 'h'});
    }
}
