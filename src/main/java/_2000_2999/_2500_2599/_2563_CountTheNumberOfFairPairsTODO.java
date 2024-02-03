package _2000_2999._2500_2599;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 2563. Count the Number of Fair Pairs
public class _2563_CountTheNumberOfFairPairsTODO {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int ans = 0;

        if (upper == lower) {
            for (int i = 0; i < nums.length - 1; i++) {
                int target = lower - nums[i];
                int ind = bs(nums, target);
                if (nums[ind] == target) {
                    ans++;
                    int j = ind + 1;
                    while (j < nums.length && nums[j] == target) {
                        j++;
                        ans++;
                    }
                    j = ind - 1;
                    while (j >= 0 && nums[j] == target) {
                        j--;
                        ans++;
                    }
                }
            }
            return ans;
        }

        Set<Integer> notFound = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (notFound.isEmpty() || !notFound.contains(nums[i])) {
                int max = upper - nums[i];
                int min = lower - nums[i];
                if (max < min) {
                    notFound.add(nums[i]);

                } else {
                    int minInd = bs(nums, min);
                    int maxInd = bs(nums, max);
                    if (minInd == 0 && nums[minInd] >= min) {
                        maxInd++;
                    }
                    if (minInd == maxInd) {
                        if (nums[minInd] == max) {
                            ans++;
                        } else {
                            notFound.add(nums[i]);
                        }
                    } else if (minInd == 0 && nums[minInd] < min || maxInd == nums.length - 1 && nums[maxInd] > max) {
                        notFound.add(nums[i]);
                    } else {
                        ans += maxInd - minInd;
                    }
                }

            }
        }
        return ans;
    }

    private int bs(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left < right) {
            mid = (right + left) / 2;
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public void solution() {
        System.out.println(countFairPairs(new int[]{0,0,0,0,0,0}, -1000000000, 1000000000));
    }
}
