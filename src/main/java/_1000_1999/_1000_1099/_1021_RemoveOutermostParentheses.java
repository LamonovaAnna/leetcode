package _1000_1999._1000_1099;

// 1021. Remove Outermost Parentheses
public class _1021_RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        int startInd = -1;
        int leftInd = 0;
        int rightInd = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (startInd == -1) {
                startInd = i;
            }
            if (s.charAt(i) == '(') {
                leftInd++;
            } else {
                rightInd++;
            }

            if (leftInd == rightInd) {
                if (startInd + 1 < i) {
                    sb.append(s, startInd + 1, i);
                }
                startInd = -1;
                leftInd = 0;
                rightInd = 0;
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }
}
