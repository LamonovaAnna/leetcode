package _1000_1999._1700_1799;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1773. Count Items Matching a Rule
public class _1773_CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (List<String> item : items) {
            switch (ruleKey) {
                case "type" -> {
                    if (item.get(0).equals(ruleValue)) {
                        counter++;
                    }
                }
                case "color" -> {
                    if (item.get(1).equals(ruleValue)) {
                        counter++;
                    }
                }
                case "name" -> {
                    if (item.get(2).equals(ruleValue)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public void solution() {
        List<List<String>> items = new ArrayList<>();
        List<String> list = Arrays.asList("phone", "blue", "pixel");
        items.add(list);
        list = Arrays.asList("computer", "silver", "lenovo");
        items.add(list);
        list = Arrays.asList("phone", "gold", "iphone");
        items.add(list);
        System.out.println(countMatches(items, "color", "silver"));

        items = new ArrayList<>();
        list = Arrays.asList("phone", "blue", "pixel");
        items.add(list);
        list = Arrays.asList("computer", "silver", "phone");
        items.add(list);
        list = Arrays.asList("phone", "gold", "iphone");
        items.add(list);
        System.out.println(countMatches(items, "type", "phone"));
    }
}
