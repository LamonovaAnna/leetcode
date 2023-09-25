package _2000_2999._2400_2499;

import java.util.HashMap;
import java.util.Map;

// 2423. Remove Letter To Equalize Frequency
public class _2423_RemoveLetterToEqualizeFrequencyTODO {
    public boolean equalFrequency(String word) {
        int[] alphabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'a']++;
        }

        Map<Integer, Integer> fr = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int letterCount = 0;
        for (int j : alphabet) {
            if (j != 0) {
                letterCount++;
                if (!fr.containsKey(j)) {
                    fr.put(j, 0);
                }
                fr.put(j, fr.get(j) + 1);
                if (j < min) {
                    min = j;
                }
                if (j > max) {
                    max = j;
                }
            }
        }

        if (min == 1 && max == 1) {
            return true;
        }

        if (min == 1 && letterCount == 2) {
            return true;
        }

        if (letterCount == 1) {
            return true;
        }

        if (min == 1 && fr.get(min) == 1 && fr.size() == 2) {
            return true;
        }

        if (max - min == 1 && fr.get(max) == 1 && fr.get(min) == 1) {
            return true;
        }

        if (min == 1 && max == 2 && fr.get(max) == 1) {
            return true;
        }

        if (fr.size() == 1 || fr.size() > 2 || max - min > 1) {
            return false;
        }

        if (max - min == 1 && fr.get(max).equals(fr.get(min)) && fr.get(min) != 1) {
            return false;
        }

        if (min == 1 & max == 2 && fr.get(max) > 1) {
            return false;
        }

        if (max - min == 1 && fr.get(max) - fr.get(min) == 1) {
            return false;
        }


        return true;
    }

    public void solution() {
        System.out.println(equalFrequency("aaaabbbbccc"));
        System.out.println(equalFrequency("bcaebda"));
        System.out.println(equalFrequency("abbcc"));
        System.out.println(equalFrequency("babbdd"));
        System.out.println(equalFrequency("aazz"));
    }
}
