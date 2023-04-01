package _1000_1999._1500_1599;

// 1588. Sum of All Odd Length Subarrays
public class _1588_SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int tempSum = arr[i];
            int index = i + 2;
            while (index < arr.length) {
                tempSum += arr[index] + arr[index - 1];
                sum += tempSum;
                index += 2;
            }
        }
        return sum;
    }

    public void solution() {
        System.out.println(sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
        System.out.println(sumOddLengthSubarrays(new int[]{1, 2}));
        System.out.println(sumOddLengthSubarrays(new int[]{10, 11, 12}));
    }
}
