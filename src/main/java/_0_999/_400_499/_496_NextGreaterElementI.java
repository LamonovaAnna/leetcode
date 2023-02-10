package _0_999._400_499;

import java.util.Arrays;

//496. Next Greater Element I
public class _496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean isFound = false;
                    for(int l = j; l < nums2.length; l++) {
                        if(nums2[l] > nums1[i]) {
                            nums1[i] = nums2[l];
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        nums1[i] = -1;
                    }
                    break;
                }
            }
        }
        return nums1;
    }

    public void solution() {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));

    }
}
