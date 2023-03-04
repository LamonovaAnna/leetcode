package _0_999._800_899;

import java.util.Arrays;

// 888. Fair Candy Swap
public class _888_FairCandySwapTODO {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < aliceSizes.length || i < bobSizes.length; i++) {
            if (i < aliceSizes.length) {
                aSum += aliceSizes[i];
            }
            if (i < bobSizes.length) {
                bSum += bobSizes[i];
            }
        }

        int diff = Math.abs(aSum - bSum);

        int aInd;
        int bInd;
        if (aSum < bSum) {
            aInd = findIndex(aliceSizes, diff, false);
            if (aliceSizes[aInd] == diff) {
                bInd = findIndex(bobSizes, diff + 1, true);
            } else {
                bInd = findIndex(bobSizes, diff, true);
            }
        } else {
            aInd = findIndex(aliceSizes, diff, true);
            if (aliceSizes[aInd] == diff) {
                bInd = findIndex(bobSizes, diff - 1, false);
            } else {
                bInd = findIndex(bobSizes, diff, false);
            }
        }

        return new int[] {aliceSizes[aInd], bobSizes[bInd]};
    }

    private int findIndex(int[] arr, int target, boolean isLarger) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            if (arr[left] == target) {
                ans = left;
                break;
            }
            if (arr[right] == target) {
                ans = right;
                break;
            }
            if (isLarger) {
                if (arr[mid] > target) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1, 3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 2}, new int[]{2, 3})));
    }
}
