package _2000_2999._2200_2299;

// 2221. Find Triangular Sum of an Array
public class _2221_FindTriangularSumOfAnArray {
    public int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        while(nums[1] != -1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == -1) {
                    nums[i - 1] = -1;
                    break;
                }
                int num = nums[i - 1] + nums[i];
                if (num > 9) {
                    nums[i - 1] = num - 10;
                } else {
                    nums[i - 1] = num;
                }
                if (i == nums.length - 1) {
                    nums[i] = -1;
                }
            }
        }


        return nums[0];
    }

    public void solution() {
        System.out.println(triangularSum(new int[]{2,6,6,5,5,3,3,8,6,4,3,3,5,1,0,1,3,6,9})); // 8
    }
}
