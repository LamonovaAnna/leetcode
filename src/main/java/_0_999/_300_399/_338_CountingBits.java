package _0_999._300_399;

import java.util.Arrays;

//338. Counting Bits
public class _338_CountingBits {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int counter = 0;
            for (int j = 0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') {
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
