package _2000_2999._2500_2599;

// 2535. Difference Between Element Sum and Digit Sum of an Array
public class _2535_DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;

        for (int j : nums) {
            int num = j;
            sum += num;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }
        return sum - digitSum;
    }

    public void solution() {
        System.out.println(differenceOfSum(new int[]{1, 15, 6, 3}));
        System.out.println(differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}
