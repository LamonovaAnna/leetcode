package _0_999._500_599;

import java.util.*;

// 599. Minimum Index Sum of Two Lists
public class _599_MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length == 1 && list2.length == 1) {
            if (list1[0].equals(list2[0])) {
                return list1;
            }
            return new String[]{};
        }

        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            words.put(list1[i], i);
        }

        List<Integer> size = new ArrayList<>();
        List<String> common = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (words.containsKey(list2[i])) {
                common.add(list2[i]);
                size.add(words.get(list2[i]) + i);
            }
        }

        if (common.size() > 1) {
            List<Integer> sorted = new ArrayList<>(size);
            Collections.sort(sorted);
            int min = sorted.get(0);
            int n = 1;
            int ind = 1;

            while(sorted.get(ind) == min) {
                ind++;
                n++;
                if (ind == sorted.size()) {
                    return common.toArray(new String[0]);
                }
            }

            String[] ans = new String[n];
            ind = 0;
            int ansInd = 0;
            while (n > 0) {
                if (size.get(ind) == min) {
                    n--;
                    ans[ansInd] = common.get(ind);
                    ansInd++;
                }
                ind++;
            }
            return ans;
        }

        return new String[] {common.get(0)};
    }

    public void solution() {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Burger King","Tapioca Express","Shogun"})));
    }
}
