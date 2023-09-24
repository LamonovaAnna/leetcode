package _1000_1999._1200_1299;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1282. Group the People Given the Group Size They Belong To
public class _1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        if (groupSizes.length == 1) {
            return List.of(List.of(0));
        }

        Map<Integer, List<Integer>> pos = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            if (!pos.containsKey(groupSizes[i])) {
                pos.put(groupSizes[i], new ArrayList<>());
            }
            pos.get(groupSizes[i]).add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> kv : pos.entrySet()) {
            List<Integer> val = kv.getValue();
            int counter = kv.getKey();
            List<Integer> data = new ArrayList<>();
            for (Integer i : val) {
                if (counter == 0) {
                    ans.add(data);
                    data = new ArrayList<>();
                    counter = kv.getKey();
                }
                data.add(i);
                counter--;
            }
            ans.add(data);
        }
        return ans;
    }

    public void solution() {
        System.out.println(groupThePeople(new int[] {3,3,3,3,3,1,3})); // [[5],[0,1,2],[3,4,6]]
    }
}
