package _0_999._200_299;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//217. Contains Duplicate
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> singleOnly = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        return singleOnly.size() < nums.length;
    }

    public void solution() {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
