package _1000_1999._1400_1499;

// 1460. Make Two Arrays Equal by Reversing Subarrays
public class _1460_MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        int[] num = new int[1001];
        for (int j : target) {
            num[j]++;

        }

        for (int j : arr) {
            if (num[j] == 0) {
                return false;
            } else {
                num[j]--;
            }
        }
        return true;
    }

}
