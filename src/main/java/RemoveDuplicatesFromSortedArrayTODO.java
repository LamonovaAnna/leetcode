import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArrayTODO {
    public int removeDuplicates(int[] nums) {
        Set<Integer> remover = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        nums = new ArrayList<>(remover).stream().mapToInt(Integer::intValue).toArray();
        return remover.size();
    }

    public void solution() {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}


