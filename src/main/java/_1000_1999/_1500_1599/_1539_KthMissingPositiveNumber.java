package _1000_1999._1500_1599;

// 1539. Kth Missing Positive Number
public class _1539_KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        int ans = 0;
        int[] nums = new int[arr[arr.length - 1] + 1];

        for (int j : arr) {
            nums[j]++;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans = i;
                k--;
            }
            if (k < 1) {
                break;
            }
        }

        if (k != 0) {
            ans = nums.length - 1 + k;
        }

        return ans;
    }

    public void solution() {
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
    }
}
