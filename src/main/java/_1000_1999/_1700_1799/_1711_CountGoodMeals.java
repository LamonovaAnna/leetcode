package _1000_1999._1700_1799;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1711. Count Good Meals
public class _1711_CountGoodMeals {
    public int countPairs(int[] deliciousness) {
        if (deliciousness.length == 1) {
            return 0;
        }

        Map<Integer, Integer> power = new HashMap<>();
        long start = 1;
        while (start < 2097151L) {
            power.put((int) start, null);
            start *= 2;
        }


        int counter = 0;
        Map<Integer, Integer> num = new HashMap<>();
        for (int j : deliciousness) {
            if (num.containsKey(j)) {
                num.put(j, num.get(j) + 1);
            } else {
                num.put(j, 1);
            }
        }

        Set<Integer> past = new HashSet<>();
        for (Map.Entry<Integer, Integer> val : num.entrySet()) {
            if (val.getValue() > 1) {
                if (power.containsKey(val.getKey() * 2)) {
                    int temp = val.getValue() - 1;
                    while (temp != 0) {
                        counter += temp;
                        temp--;
                    }
                }
            }
            for (Map.Entry<Integer, Integer> val1 : num.entrySet()) {
                if (val1 != val && !past.contains(val1.getKey())) {
                    if (power.containsKey(val1.getKey() + val.getKey())) {
                        counter += val1.getValue() * val.getValue();
                    }
                }
            }
            past.add(val.getKey());
        }
        return counter;
    }

    public void solution() {
        System.out.println(countPairs(new int[]{149, 107, 1, 63, 0, 1, 6867, 1325, 5611, 2581, 39, 89, 46, 18, 12, 20, 22, 234}));
    }
}
