package _2000_2999._2200_2299;

// 2243. Calculate Digit Sum of a String
public class _2243_CalculateDigitSumOfAString {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            int index = 0;
            while (index < s.length()) {
                int stop = index + k;
                int counter = 0;
                for (int i = index; i != stop; i++) {
                    if (i == s.length()) {
                        break;
                    }
                    counter += Integer.parseInt(String.valueOf(s.charAt(i)));
                    index = i;
                }
                index++;
                sb.append(counter);
            }
            s = String.valueOf(sb);
        }
        return s;
    }

    public void solution() {
        System.out.println(digitSum("1234", 2));
        System.out.println(digitSum("11111222223", 3));
        System.out.println(digitSum("00000000", 3));

    }
}
