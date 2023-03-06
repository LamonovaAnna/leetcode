package _1000_1999._1300_1399;

import java.util.Arrays;

// 1313. Decompress Run-Length Encoded List
public class _1313_DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int[] ans = new int[0];

        for (int i = 0; i < nums.length; i += 2) {
            int length  = nums[i];
            int val = nums[i + 1];
            ans = Arrays.copyOf(ans, ans.length + length);
            while (length > 0) {
                ans[ans.length - length] = val;
                length--;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 1, 2, 3})));
    }
}
