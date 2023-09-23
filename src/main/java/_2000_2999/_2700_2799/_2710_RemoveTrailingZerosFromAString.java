package _2000_2999._2700_2799;

// 2710. Remove Trailing Zeros From a String
public class _2710_RemoveTrailingZerosFromAString {
    public String removeTrailingZeros(String num) {
        int tail = num.length();

        for (int i = num.length() - 1; i >= 0 ; i--) {
            if (num.charAt(i) != '0') {
                tail = i;
                break;
            }
        }

        return num.substring(0, tail + 1);
    }
}
