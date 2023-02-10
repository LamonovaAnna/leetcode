package _0_999._700_799;

//771. Jewels and Stones
public class _771_JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
