import java.util.HashMap;
import java.util.Map;

//219. Contains Duplicate II
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> val = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (!val.containsKey(nums[i])) {
                val.put(nums[i], i);
            } else {
                if (Math.abs(val.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    val.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}
