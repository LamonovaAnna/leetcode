package _1000_1999._1500_1599;

// 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
public class _1576_ReplaceAllToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == '?') {
                return "a";
            }
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {

                if (i == 0) {
                    if (s.charAt(1) == 'a') {
                        sb.append('b');
                    } else if (s.charAt(1) == '?') {
                        sb.append('a');
                    } else {
                        sb.append(Character.toString( s.charAt(1) - 1));
                    }

                } else if (i == s.length() - 1) {
                    if (s.charAt(s.length() - 2) == 'z') {
                        sb.append('a');
                    } else {
                        sb.append(Character.toString(sb.charAt(s.length() - 2) + 1));
                    }

                } else {
                    if (sb.charAt(i - 1) + 1 == s.charAt(i + 1)) {
                        if (s.charAt(i + 1) == 'z') {
                            sb.append('a');
                        } else {
                            sb.append(Character.toString(s.charAt(i + 1) + 1));
                        }
                    } else {
                        if (sb.charAt(i - 1) == 'z') {
                            if (s.charAt(i + 1) == 'y') {
                                sb.append('a');
                            } else {
                                sb.append('y');
                            }
                        } else {
                            sb.append(Character.toString(sb.charAt(i - 1) + 1));
                        }
                    }
                }

            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(modifyString("z?a"));
        System.out.println(modifyString("ubv?w"));
    }
}
