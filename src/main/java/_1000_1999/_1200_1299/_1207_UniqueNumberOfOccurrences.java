package _1000_1999._1200_1299;

import java.util.Arrays;

// 1207. Unique Number of Occurrences
public class _1207_UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] count = new int[2003];

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                if (count[counter] == 0) {
                    count[counter] = arr[i];
                    counter = 0;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(uniqueOccurrences(new int[]{-4, 3, 3}));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));

        System.out.println(uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}
