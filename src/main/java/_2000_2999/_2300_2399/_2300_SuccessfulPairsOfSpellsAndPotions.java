package _2000_2999._2300_2399;

import java.util.Arrays;

// 2300. Successful Pairs of Spells and Potions
public class _2300_SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int counter = 0;
            if (spells[i] == 1) {
                int start = binarySearch(potions, success);
                for (int j = start; j < potions.length; j++) {
                    if (potions[j] >= success)  {
                        counter++;
                    }
                }
            } else {
                int start = binarySearch(potions, success / spells[i]);
                while (start > 0) {
                    if (potions[start - 1] == success/ spells[i]) {
                            start--;
                    } else {
                        break;
                    }
                }
                for (int j = start; j < potions.length; j++) {
                    if ((long) potions[j] * spells[i] >= success) {
                        counter = potions.length - j;
                        break;
                    }
                }
            }
            ans[i] = counter;
        }
        return ans;
    }

    private int binarySearch(int[] arr, long target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (right + left) / 2;
            if (arr[left] == target) {
                return left;
            } else if (arr[mid] == target) {
                return mid;
            } else if (arr[right] == target) {
                return right;
            }

            if (target >arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public void solution() {
        System.out.println(Arrays.toString(successfulPairs(new int[]{100000, 100000}, new int[]{100000, 100000}, 10000000000L)));
        System.out.println(Arrays.toString(successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16)));
    }
}
