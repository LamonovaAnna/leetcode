package _2000_2999._2400_2499;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2418. Sort the People
public class _2418_SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] ans = new String[names.length];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            ans[i] = map.get(heights[heights.length - 1 - i]);
        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170})));
        System.out.println(Arrays.toString(sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150})));

    }
}
