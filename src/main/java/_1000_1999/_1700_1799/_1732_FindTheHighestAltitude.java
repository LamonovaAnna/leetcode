package _1000_1999._1700_1799;

// 1732. Find the Highest Altitude
public class _1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        if (gain.length == 1) {
            return Math.max(gain[0], 0);
        }
        
        int max = 0;
        int alt = 0;

        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            if (alt > max) {
                max = alt;
            }
        }

        return max;
    }

    public void solution() {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }
}
