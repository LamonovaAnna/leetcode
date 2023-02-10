package _0_999._700_799;

import java.util.ArrayList;
import java.util.List;

//728. Self Dividing Numbers
public class _728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String digits = String.valueOf(i);
            if (digits.length() == 1 && !digits.equals("0")) {
                result.add(i);
            } else {
                if (!digits.contains("0")) {
                    int counter = 0;
                    for (int j = 0; j < digits.length(); j++) {
                        int digit = Integer.parseInt(String.valueOf(digits.charAt(j)));
                        if (i % digit == 0) {
                            counter++;
                        }
                    }
                    if (counter == digits.length()) {
                        result.add(i);
                    }
                }
            }
        }
        return result;
    }

    public void solution() {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }
}
