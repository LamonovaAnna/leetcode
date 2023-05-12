package _0_999._200_299;

// 227. Basic Calculator II
public class _227_BasicCalculatorII {
    public int calculate(String s) {
        if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0))) {
                return Integer.parseInt(s);
            } else{
                return 0;
            }
        }

        char[] symbols = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        int num1 = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isDigit(symbols[i])) {
                num1 *= 10;
                num1 += symbols[i] - '0';
            }
            if (symbols[i] == '+' || symbols[i] == '-') {
                sb.append(num1).append(' ').append(symbols[i]).append(' ');
                num1 = 0;
            } else if (symbols[i] == '*' || symbols[i] == '/') {

                while (i < symbols.length && (symbols[i] != '+' && symbols[i] != '-')) {
                    if (symbols[i] == '*' || symbols[i] == '/') {
                        char symbol = symbols[i];
                        i++;
                        int[] data = doOperation(i, symbols, symbol, num1);
                        num1 = data[1];
                        i = data[0];
                    } else {
                        i++;
                    }
                }

                sb.append(num1).append(' ');
                if (i < symbols.length) {
                    sb.append(symbols[i]).append(' ');
                }
                num1 = 0;
            }
        }

        if (sb.isEmpty()) {
            return num1;
        }

        if (!Character.isDigit(sb.charAt(sb.length() - 1)) && !Character.isDigit(sb.charAt(sb.length() - 2))) {
            sb.append(num1);
        }
        String[] nums = sb.toString().split(" ");
        int ans = Integer.parseInt(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i].equals("+")) {
                i++;
                ans += Integer.parseInt(nums[i]);
            } else {
                i++;
                ans -= Integer.parseInt(nums[i]);
            }
        }

        return ans;
    }

    private int[] doOperation(int i, char[] symbols, char symbol, int num1) {
        int num2 = 0;
        while (i < symbols.length) {
            if (Character.isDigit(symbols[i])) {
                num2 *= 10;
                num2 += symbols[i] - '0';
            } else if (symbols[i] == '-' || symbols[i] == '+' || symbols[i] == '*' || symbols[i] == '/') {
                break;
            }
            i++;
        }
        if (symbol == '*') {
            num1 *= num2;
        } else {
            num1 /= num2;
        }
        return new int[]{i, num1};
    }

    public void solution() {
        //System.out.println(calculate("3+2*2"));
        System.out.println(calculate("42"));
        System.out.println(calculate(" 3+5 / 2 "));
    }
}
