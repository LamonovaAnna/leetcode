package _2000_2999._2200_2299;

import java.util.*;

// 2200. Find All K-Distant Indices in an Array
public class _2200_FindAllKDistantIndicesInAnArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        if (nums.length == 1) {
            return List.of(0);
        }

        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                pos.add(i);
            }
        }

        Set<Integer> ans = new HashSet<>();
        for (Integer po : pos) {
            for (int j = 0; j < nums.length; j++) {
                if (po - j <= k && po - j >= -k) {
                    ans.add(j);
                }
            }
        }

        List<Integer> sorted = new ArrayList<>(ans);
        Collections.sort(sorted);
        return sorted;
    }

    public void solution() {
        System.out.println(findKDistantIndices(new int[] {3,4,9,1,3,9,5}, 9, 1)); // 1,2,3,4,5,6
    }

}
