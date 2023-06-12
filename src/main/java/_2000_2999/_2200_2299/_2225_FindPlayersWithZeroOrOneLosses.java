package _2000_2999._2200_2299;

import java.util.*;

// 2225. Find Players With Zero or One Losses
public class _2225_FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        if (matches.length == 1) {
            return List.of(List.of(matches[0][0]), List.of(matches[0][1]));
        }
        Map<Integer, Integer> lose = new HashMap<>();

        for (int[] match : matches) {
            if (!lose.containsKey(match[1])) {
                lose.put(match[1], 1);
            } else {
                lose.put(match[1], lose.get(match[1]) + 1);
            }
            if (!lose.containsKey(match[0])) {
                lose.put(match[0], 0);
            }
        }

        List<Integer> notLose = new ArrayList<>();
        List<Integer> loseOnes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : lose.entrySet()) {
            if (entry.getValue() == 0) {
                notLose.add(entry.getKey());
            } else if (entry.getValue() == 1) {
                loseOnes.add(entry.getKey());
            }
        }
        if (!notLose.isEmpty() && notLose.size() > 1) {
            notLose.sort(Comparator.comparingInt(e -> e));
        }
        if (!loseOnes.isEmpty() && loseOnes.size() > 1) {
            loseOnes.sort(Comparator.comparingInt(e -> e));
        }

        return List.of(notLose, loseOnes);
    }

    public void solution() {
        System.out.println(findWinners(new int[][]{{1, 10000}}));
        System.out.println(findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));
    }
}
