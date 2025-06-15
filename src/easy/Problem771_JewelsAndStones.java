package easy;

public class Problem771_JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        char[] jewelsToChar = jewels.toCharArray();
        char[] stonesToChar = stones.toCharArray();

        int counter = 0;

        for (int i = 0; i < jewelsToChar.length; i++) {
            for (int j = 0; j < stonesToChar.length; j++) {
                if (jewelsToChar[i] == stonesToChar[j]) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
