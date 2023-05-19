package _0_999._0_99;

// 11. Container With Most Water
public class _11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int left = 0;
        int right = height.length - 1;
        int ans = 0;

        while (left != right) {
            int temp = (right - left) * Math.min(height[right], height[left]);
            if (temp > ans) {
                ans = temp;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
