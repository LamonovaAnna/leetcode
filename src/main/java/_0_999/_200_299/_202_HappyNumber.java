package _0_999._200_299;

import java.util.HashSet;
import java.util.Set;

// 202. Happy Number
public class _202_HappyNumber {
    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        Set<String> seen = new HashSet<>();

        while (!s.equals("1") && !seen.contains(s)) {
            seen.add(s);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int num = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum += (num * num);
            }
            s = String.valueOf(sum);
        }
        return s.equals("1");
    }

    public void solution() {
        System.out.println(isHappy(3));
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));

    }
}
