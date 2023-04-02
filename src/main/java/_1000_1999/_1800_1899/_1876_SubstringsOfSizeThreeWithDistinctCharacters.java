package _1000_1999._1800_1899;

// 1876. Substrings of Size Three with Distinct Characters
public class _1876_SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int counter = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 1) &&
            s.charAt(i) != s.charAt(i + 2) &&
            s.charAt(i + 1) != s.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }
}
