package _0_999._0_99;

import java.util.HashMap;
import java.util.Map;

//20. Valid Parentheses
public class _20_ValidParenthesesTODO {

    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case '(':
                    if (sb.lastIndexOf(")") == -1 ||
                            (sb.lastIndexOf(")") - i) % 2 == 0
                                    && sb.lastIndexOf("0") - i != 1) {
                        return false;
                    } else {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(sb.lastIndexOf(")"));
                    }
                    i--;
                    break;
                case '[':
                    if (sb.lastIndexOf("]") == -1 ||
                            (sb.lastIndexOf("]") - i) % 2 == 0
                                    && sb.lastIndexOf("]") - i != 1) {
                        return false;
                    } else {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(sb.lastIndexOf("]"));
                    }
                    i--;
                    break;
                case '{':
                    if (sb.lastIndexOf("}") == -1 ||
                            (sb.lastIndexOf("}") - i) % 2 == 0
                                    && sb.lastIndexOf("}") - i != 1) {
                        return false;
                    } else {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(sb.lastIndexOf("}"));
                    }
                    i--;
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(isValid("[({(())}[()])]"));
        System.out.println(isValid("{{}}"));
        System.out.println(isValid("({[)"));

        System.out.println(isValid("([)]"));
    }
}
