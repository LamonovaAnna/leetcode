package _0_999._500_599;

//541. Reverse String II
public class _541_ReverseStringII {
    public String reverseStr(String s, int k) {
        if (s.length() < k) {
            return String.valueOf(new StringBuilder(s).reverse());
        }

        StringBuilder sb = new StringBuilder();
        String start = s.substring(0, k);
        String end;
        sb.append(start).reverse();
        int n = 2;
        int endIndx = k;
        while (s.length() >= n * k) {
            String mid = s.substring(endIndx, n * k);
            if (s.length() >= n * k + k) {
                String rev = s.substring(n * k, n * k + k);
                endIndx = n * k + k;
                sb.append(mid).append(new StringBuilder(rev).reverse());
            } else if (s.length() >= n * k) {
                end = s.substring(n * k);
                sb.append(mid).append(new StringBuilder(end).reverse());
            }
            n += 2;
        }
        if (s.length() > sb.length()) {
            end = s.substring(endIndx);
            sb.append(end);
        }

        return String.valueOf(sb);
    }

    public void solution() {
        System.out.println(reverseStr("jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20));
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcd", 2));
    }
}
