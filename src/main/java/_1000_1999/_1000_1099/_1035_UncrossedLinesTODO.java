package _1000_1999._1000_1099;

// 1035. Uncrossed Lines
public class _1035_UncrossedLinesTODO {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        if (nums1.length == 1 && nums2.length == 1) {
            if (nums1[0] == nums2[0]) {
                return 1;
            } else {
                return 0;
            }
        }

        int ans = 0;
        int start = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = start; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    start = j + 1;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{0,5,2,1,5,2}));
    }
}
