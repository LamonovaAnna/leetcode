package _2000_2999._2500_2599;

import java.util.Arrays;

// 2545. Sort the Students by Their Kth Score
public class _2545_SortTheStudentsByTheirKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        if (score.length == 1) {
            return score;
        }

        int maxMark = 0;
        int maxInd = -1;
        int nextMark = 0;
        int nextInd = -1;
        int lastMax = Integer.MAX_VALUE;

        int[][] ans = new int[score.length][score[0].length];
        int index = 0;

        while (index < ans.length) {
            for (int i = 0; i < score.length; i++) {
                if (score[i][k] > maxMark && score[i][k] < lastMax) {
                    nextMark = maxMark;
                    maxMark = score[i][k];
                    nextInd = maxInd;
                    maxInd = i;
                } else if (score[i][k] > nextMark && score[i][k] < lastMax) {
                    nextMark = score[i][k];
                    nextInd = i;
                }
            }
            ans[index] = score[maxInd];
            index++;
            if (index < ans.length) {
                ans[index] = score[nextInd];
                index++;
                lastMax = nextMark;
                nextMark = 0;
                maxMark = 0;
            } else {
                break;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(sortTheStudents(new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2)));
    }
}
