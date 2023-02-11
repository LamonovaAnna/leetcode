package _1000_1999._1000_1099;

import java.util.Arrays;

//1046. Last Stone Weight
public class _1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        while (stones[stones.length - 2] != 0) {
            if (stones[stones.length - 1] == stones[stones.length - 2]) {
                stones[stones.length - 1] = 0;
            } else {
                stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];

            }
            stones[stones.length - 2] = 0;
            Arrays.sort(stones);
        }
        return stones[stones.length - 1];
    }

    public void solution() {
        System.out.println(lastStoneWeight(new int[]{3, 7, 2}));
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
