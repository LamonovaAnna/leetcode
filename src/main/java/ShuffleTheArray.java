import java.util.Arrays;

//1470. Shuffle the Array
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int counter = 0;
        int[] half = Arrays.copyOfRange(nums, n, nums.length);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[counter];
            } else {
                result[i] = half[counter];
                counter++;
            }
        }
        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
        System.out.println(Arrays.toString(shuffle(new int[]{1, 1, 2, 2}, 2)));
    }
}
