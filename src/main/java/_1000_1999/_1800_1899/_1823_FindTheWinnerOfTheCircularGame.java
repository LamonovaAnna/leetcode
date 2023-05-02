package _1000_1999._1800_1899;

import java.util.LinkedList;
import java.util.Queue;

// 1823. Find the Winner of the Circular Game
public class _1823_FindTheWinnerOfTheCircularGame {
    public int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }

        Queue<Integer> gamers = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            gamers.add(i);
        }

        while (gamers.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                int gamer = gamers.poll();
                gamers.add(gamer);
            }
            gamers.poll();
        }
        return gamers.peek();
    }

    public void solution() {
        System.out.println(findTheWinner(5, 2));
    }
}
