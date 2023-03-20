package _0_999._400_499;

// 495. Teemo Attacking
public class _495_TeemoAttackingTODO {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int temp = 0;

        for (int i = 0; i < timeSeries.length; i++) {
            if (temp >= timeSeries[i]) {
                temp = timeSeries[i] + duration - (temp - timeSeries[i]);
                total = 0;
            }
                temp = timeSeries[i] + duration;
        }
        return 0;

    }

    public void solution() {
        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2}, 2));
    }
}
