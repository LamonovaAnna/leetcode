package _0_999._0_99;

//20. Valid Parentheses
public class _20_ValidParenthesesTODO {

    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        String checking;


        for (int i = 0; i < sb.length(); i++) {
            checking = sb.toString();
            if (sb.charAt(i) == '{'  && checking.contains("}")) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(sb.indexOf("}"));
                i--;
            } else if (sb.charAt(i) == '(' && checking.contains(")")) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(sb.indexOf(")"));
                i--;
            } else if (sb.charAt(i) == '[' && checking.contains("]")) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(sb.indexOf("]"));
                i--;
            }
        }

        if (sb.length() == 0) {
            return true;
        }
        return false;
    }

    public void solution() {
        System.out.println(isValid("({[)"));
        System.out.println(isValid("{{}}"));
    }
}
