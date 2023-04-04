package _0_999._800_899;

import java.util.Arrays;

// 881. Boats to Save People
public class _881_BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        int i = 0;
        int j = people.length - 1;
        Arrays.sort(people);

        while (i <= j) {
            if (people[j] != limit) {
                if (people[j] + people[i] <= limit) {
                    i++;
                }
            }
            ans++;
            j--;
        }
        return ans;
    }

    public void solution() {
        System.out.println(numRescueBoats(new int[]{1, 2}, 3));
        System.out.println(numRescueBoats(new int[]{3, 2,2, 2, 1}, 3));
        System.out.println(numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }
}
