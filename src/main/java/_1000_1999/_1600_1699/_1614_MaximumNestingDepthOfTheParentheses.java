package _1000_1999._1600_1699;

// 1614. Maximum Nesting Depth of the Parentheses
public class _1614_MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int counter = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter++;
            } else if (s.charAt(i) == ')') {
                if (counter > ans) {
                    ans = counter;
                }
                counter--;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }
}
