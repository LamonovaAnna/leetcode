package _1000_1999._1900_1999;

// 1963. Minimum Number of Swaps to Make the String Balanced
public class _1963_MinimumNumberOfSwapsToMakeTheStringBalancedTODO {
    public int minSwaps(String s) {
        if (s.length() == 2) {
            if (s.charAt(0) == ']' || s.charAt(1) == '[') {
                return 1;
            }
            return 0;
        }

        int mid = s.length() / 2 - 1;
        int ans = 0;

        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) == ']' || s.charAt(s.length() - 1 - i) == '[') {
                ans++;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(minSwaps("][]["));
    }
}
