package _0_999._400_499;

// 415. Add Strings
public class _415_AddStrings {
    public String addStrings(String num1, String num2) {
        int firstNum = 0;
        int secondNum = 0;
        int residual = 0;
        int size = Integer.max(num1.length(), num2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (num1.length() - 1 - i >= 0) {
                firstNum = Integer.parseInt(String.valueOf(num1.charAt(num1.length() - 1 - i)));
            }
            if (num2.length() - 1 - i >= 0) {
                secondNum = Integer.parseInt(String.valueOf(num2.charAt(num2.length() - 1 - i)));
            }
            int sum = firstNum + secondNum + residual;
            if (sum > 9) {
                residual = 1;
                sb.append(sum - 10);
                if (size == i + 1) {
                    sb.append(1);
                }
            } else {
                residual = 0;
                sb.append(sum);
            }
            firstNum = 0;
            secondNum = 0;
        }

        return String.valueOf(sb.reverse());
    }



    public void solution() {
        System.out.println(addStrings("6913259244", "71103343"));
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("0", "0"));
        System.out.println(addStrings("99", "9"));
    }
}
