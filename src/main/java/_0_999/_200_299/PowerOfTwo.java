package _0_999._200_299;

//231. Power of Two
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
            if (n == 2) {
                return true;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(10));

    }
}
