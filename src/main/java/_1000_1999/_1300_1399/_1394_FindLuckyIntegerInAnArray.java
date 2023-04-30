package _1000_1999._1300_1399;

// 1394. Find Lucky Integer in an Array
public class _1394_FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        if (arr.length == 1 && arr[0] == 1) {
            return 1;
        }
        int[] nums = new int[501];
        nums[0] = -1;

        int maxVal = 0;
        for (int j : arr) {
            if (j > maxVal) {
                maxVal = j;
            }
            nums[j]++;
        }

        for (int i = maxVal; i >= 0; i--) {
            if (nums[i] == i) {
                return i;
            }
        }

        return -1;
    }

    public void solution() {
        System.out.println(findLucky(new int[]{2, 2, 3, 4}));
    }
}
