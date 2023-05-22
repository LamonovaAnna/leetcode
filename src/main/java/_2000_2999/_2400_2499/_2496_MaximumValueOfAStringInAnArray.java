package _2000_2999._2400_2499;

// 2496. Maximum Value of a String in an Array
public class _2496_MaximumValueOfAStringInAnArray {
    public int maximumValue(String[] strs) {
        if (strs.length == 1) {
            char[] chars = strs[0].toCharArray();
            for (char aChar : chars) {
                if (Character.isLetter(aChar)) {
                    return chars.length;
                }
            }
            return Integer.parseInt(strs[0]);
        }

        int max = 0;

        for (String str : strs) {
            int temp = 0;
            char[] chars = str.toCharArray();
            for (char symbol : chars) {
                if (Character.isLetter(symbol)) {
                    temp = str.length();
                    break;
                }
            }
            if (temp == 0) {
                temp = Integer.parseInt(str);
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public void solution() {
        System.out.println(maximumValue(new String[]{"alic3","bob","3","4","00000"}));
    }
}
