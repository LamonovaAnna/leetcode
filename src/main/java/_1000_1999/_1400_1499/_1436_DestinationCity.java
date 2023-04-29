package _1000_1999._1400_1499;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1436. Destination City
public class _1436_DestinationCity {
    public String destCity(List<List<String>> paths) {
        if (paths.size() == 1) {
            return paths.get(0).get(1);
        }

        Set<String> words = new HashSet<>();

        for (List<String> path : paths) {
            words.add(path.get(0));
        }

        for (List<String> path : paths) {
            if (!words.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }

    public void solution() {
        System.out.println(destCity(List.of(List.of("B", "C"), List.of("D", "B"), List.of("C", "A"))));
    }
}
