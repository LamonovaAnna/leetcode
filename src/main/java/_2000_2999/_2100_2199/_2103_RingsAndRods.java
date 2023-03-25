package _2000_2999._2100_2199;

import java.util.*;

// 2103. Rings and Rods
public class _2103_RingsAndRods {
    public int countPoints(String rings) {
        int counter = 0;
        if (rings.length() < 6) {
            return counter;
        }


        Map<Integer, Set<Character>> rods = new HashMap<>();
        for (int i = 1; i < rings.length(); i = i + 2) {
            int index = Integer.parseInt(String.valueOf(rings.charAt(i)));
            char colour = rings.charAt(i - 1);
            if (rods.containsKey(index)) {
                rods.get(index).add(colour);
            } else {
                rods.put(index, new HashSet<>(List.of(colour)));
            }
        }

        for (Set<Character> val : rods.values()) {
            if (val.size() == 3) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
        System.out.println(countPoints("B0R0G0R9R0B0G0"));
        System.out.println(countPoints("G4"));
    }
}
