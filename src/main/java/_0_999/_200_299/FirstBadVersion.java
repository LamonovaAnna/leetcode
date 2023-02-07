package _0_999._200_299;

//278. First Bad Version
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int i = n / 2;
        int right = 0;
        int left = n;

        while (Math.abs(left - right) != 1) {
            if (testMass(i)) {
                left = i;
            } else {
                right = i;
            }
            i = (right - left) / 2 + left;
        }
        return left;
    }


    private boolean testMass(int i) {
        boolean[] badV = new boolean[]{false, false, true, true, true};
        return badV[i];
    }

    public void solution() {
        System.out.println(firstBadVersion(3));
    }
}
