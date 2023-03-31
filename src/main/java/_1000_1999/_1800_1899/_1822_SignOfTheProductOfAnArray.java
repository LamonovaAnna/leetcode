package _1000_1999._1800_1899;

// 1822. Sign of the Product of an Array
public class _1822_SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int prod = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                prod *= -1;
            } else if (nums[i] == 0) {
                prod *= 0;
            }
        }

        return Integer.compare(prod, 0);
    }

    public void solution() {
        System.out.println(arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
        System.out.println(arraySign(new int[]{1, 5, 0, 2, -3}));
        System.out.println(arraySign(new int[]{-1, 1, -1, 1, -1}));
    }
}
