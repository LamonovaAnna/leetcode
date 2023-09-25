package _2000_2999._2200_2299;

import java.util.HashMap;
import java.util.Map;

// 2283. Check if Number Has Equal Digit Count and Digit Value
public class _2283_CheckIfNumberHasEqualDigitCountAndDigitValue {
    public boolean digitCount(String num) {
        Map<Character, Integer> fr = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            fr.put(num.charAt(i), fr.getOrDefault(num.charAt(i), 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (!fr.containsKey((char)(i + '0'))) {
                fr.put((char)(i + '0'), 0);
            }
        }

        for (int i = 0; i < fr.size(); i++) {
            char c = (char)(i + '0');
            if (!fr.containsKey(c)) {
                return false;
            }
            if (fr.get(c) != Integer.parseInt(String.valueOf(num.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    public void solution() {
        System.out.println(digitCount("42101000"));
    }
}
