package _0_999._400_499;

import java.util.*;

// 451. Sort Characters By Frequency
public class _451_SortCharactersByFrequency {
    public String frequencySort(String s) {
        if (s.length() < 3) {
            return s;
        }

        int[] alphabet = new int[123];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - '0']++;
        }

        Map<Integer, List<Character>> chars = new HashMap<>();
        List<Integer> keys = new ArrayList<>();

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                if (!chars.containsKey(alphabet[i])) {
                    chars.put(alphabet[i], new ArrayList<>());
                    keys.add(alphabet[i]);
                }
                chars.get(alphabet[i]).add((char)(i + '0'));
            }
        }

        keys.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (Integer key : keys) {
            for (char letter : chars.get(key)) {
                sb.append(String.valueOf(letter).repeat(Math.max(0, key)));
            }
        }

        return sb.toString();
    }

    public void solution() {
        System.out.println(frequencySort("tree"));
    }
}
