//326. Power of Three
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int root = 0;
        int temp = n;
        while (temp >= 3) {
            temp = temp / 3;
            root++;
        }

        return Math.pow(3, root) == n;
    }

    public void solution() {
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(81));

    }
}
