package _1000_1999._1600_1699;

import java.util.Arrays;

// 1652. Defuse the Bomb
public class _1652_DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }

        int[] ans = new int[code.length];

        int counter = 0;
        int firstNum = 0;
        int lastInd = -1;
        int start = 1;
        int sum = 0;
        if (k > 0) {
            for (int i = 0; i < ans.length; i++) {

                if (lastInd == -1) {
                    for (int j = 1; j < code.length; j++) {
                        sum += code[j];
                        counter++;
                        lastInd = j;
                        if (counter == k) {
                            break;
                        }
                        if (j == code.length - 1) {
                            j = 0;
                        }
                    }

                } else {
                    sum -= firstNum;
                    if (lastInd < code.length - 1) {
                        lastInd++;
                    } else {
                        lastInd = 0;
                    }
                    sum += code[lastInd];
                }
                ans[i] = sum;
                if (start > code.length - 1) {
                    start = 0;
                }
                firstNum = code[start];
                start++;
            }
        }

        if (k < 0) {
            start = -1;
            for (int i = 0; i < ans.length; i++) {

                if (i == 0) {
                    for (int j = code.length - 1; j >= 0; j--) {
                        sum += code[j];
                        counter--;
                        lastInd = j;
                        if (counter == k) {
                            break;
                        }
                        if (j == 0) {
                            j = code.length - 1;
                        }
                    }

                } else {
                    sum -= code[lastInd];
                    lastInd++;
                    if (lastInd == code.length) {
                        lastInd = 0;
                    }
                    sum += firstNum;
                }
                ans[i] = sum;
                start++;
                firstNum = code[start];
            }

        }
        return ans;
    }

    public void solution() {
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[]{1, 2, 3, 4}, 0)));
        System.out.println(Arrays.toString(decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}
