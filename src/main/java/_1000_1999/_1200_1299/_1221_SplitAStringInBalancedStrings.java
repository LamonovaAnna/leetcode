package _1000_1999._1200_1299;

// 1221. Split a String in Balanced Strings
public class _1221_SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int counter = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                counter++;
                l = 0;
                r = 0;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));

    }
}
