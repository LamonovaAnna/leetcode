package _0_999._0_99;

//7. Reverse Integer
public class _7_ReverseInteger {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            sb.append("-").append(new StringBuilder(String.valueOf(x).substring(1)).reverse());
        } else {
            sb.append(new StringBuilder(String.valueOf(x)).reverse());
        }

        if (Long.parseLong(String.valueOf(sb)) <= Integer.MAX_VALUE && Long.parseLong(String.valueOf(sb)) >= Integer.MIN_VALUE) {
            return Integer.parseInt(String.valueOf(sb));
        }
        return 0;
    }

    public void solution() {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
}
