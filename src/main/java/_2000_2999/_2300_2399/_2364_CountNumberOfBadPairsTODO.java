package _2000_2999._2300_2399;

// 2364. Count Number of Bad Pairs
public class _2364_CountNumberOfBadPairsTODO {
    public long countBadPairs(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        if (nums.length == 2) {
            if (nums[1] - nums[0] == 1) {
                return 0;
            }
            return 1;
        }

        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j - i != nums[j] - nums[i]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
