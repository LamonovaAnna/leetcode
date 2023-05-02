package _0_999._800_899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 870. Advantage Shuffle
public class _870_AdvantageShuffleTODO {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        if (nums1.length == 1) {
            return nums1;
        }

        int[] ans = new int[nums1.length];
        Arrays.sort(nums1);
        List<Integer> num = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> notFound = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            boolean isFound = false;
            if (num.get(num.size() - 1) < nums2[i]) {
                ans[i] = num.get(0);
                num.remove(0);
                isFound = true;
            } else {
                int start = 0;
                if (num.get(num.size() / 2) < nums2[i]) {
                    start = num.size() / 2;
                }
                for (int j = start; j < num.size(); j++) {
                    if (nums2[i] < num.get(j)) {
                        ans[i] = num.get(j);
                        num.remove(j);
                        isFound = true;
                        break;
                    }
                }
            }
            if (!isFound) {
                notFound.add(i);
            }
        }

        if (!num.isEmpty()) {
            int ind = 0;
            for (Integer nFound : notFound) {
                ans[nFound] = num.get(ind);
            }
        }
        return ans;
    }


    public void solution() {
        System.out.println(Arrays.toString(advantageCount(new int[]{15777,7355,6475,15448,18412}, new int[]{986,13574,14234,18412,19893})));
    }
}
