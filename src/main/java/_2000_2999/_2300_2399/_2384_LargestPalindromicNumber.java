package _2000_2999._2300_2399;

// 2384. Largest Palindromic Number
public class _2384_LargestPalindromicNumber {
    public String largestPalindromic(String num) {
        int[] numbers = new int[10];
        boolean onlyNulls = true;
        int singleNum = -1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            numbers[number]++;
            if (number != 0 && numbers[number] > 1) {
                onlyNulls = false;
            }
        }

        int end = 0;
        if (onlyNulls) {
            end = 1;
        }

        for (int i = numbers.length - 1; i >= end; i--) {
            if (numbers[i] % 2 == 0) {
                result = addNumber(result, i, numbers[i]);
            } else if (numbers[i] > 1) {
                result = addNumber(result, i, numbers[i] - 1);
                singleNum = Math.max(i, singleNum);
            } else {
                singleNum = Math.max(i, singleNum);
            }
        }

        if (singleNum > -1 && result.length() != 0) {
            result.insert(result.length() / 2, singleNum);
        } else if (singleNum > -1) {
            result.append(singleNum);
        } else if (result.length() == 0) {
            result.append(0);
        }

        return String.valueOf(result);
    }

    private StringBuilder addNumber(StringBuilder sb, int number, int count) {
        int counter = 0;
        if (sb.length() == 0) {
            while (counter != count) {
                sb.append(number);
                counter++;
            }
        } else {
            while (counter != count) {
                sb.insert(sb.length() / 2, number);
                counter++;
            }
        }
        return sb;
    }


    public void solution() {
        System.out.println(largestPalindromic("00001105"));
        System.out.println(largestPalindromic("444947137"));
        System.out.println(largestPalindromic("00009"));

    }
}
