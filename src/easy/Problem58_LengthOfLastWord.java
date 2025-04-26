package easy;

public class Problem58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        // remove any whitespace and split whole String into words and save to an array
        String[] table = s.trim().split(" ");

        // return length of last word in the array
        return table[table.length - 1].length();
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
