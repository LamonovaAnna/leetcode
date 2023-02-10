package _0_999._300_399;

//342. Power of Four
public class _342_PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        while (n % 4 == 0) {
            n = n / 4;
            if (n == 4) {
                return true;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
    }
}
