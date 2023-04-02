package _1000_1999._1600_1699;

import java.util.*;
import java.util.stream.Collectors;

// 1604. Alert Using Same Key-Card Three or More Times in a One Hour Period
public class _1604_AlertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriod {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> names = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            int hours = Integer.parseInt(keyTime[i].substring(0, 2));
            int minutes = Integer.parseInt(keyTime[i].substring(3, 5));
            if (!names.containsKey(name)) {
                names.put(name, new ArrayList<>());
            }
            names.get(name).add(hours * 60 + minutes);
        }

        for (Map.Entry<String, List<Integer>> entry : names.entrySet()) {
            if (entry.getValue().size() > 2) {
                List<Integer> temp =entry.getValue().stream().sorted().collect(Collectors.toList());
                for (int i = 2; i < temp.size(); i++) {
                    int diff = temp.get(i) - temp.get(i - 2);
                    if (diff <= 60) {
                        ans.add(entry.getKey());
                        break;
                    }
                }
            }
        }
        return ans.stream().sorted().collect(Collectors.toList());
    }

    public void solution() {
        System.out.println(alertNames(new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"},
                new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"}));
    }


}
