package _1000_1999._1900_1999;

import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] copy = new int[nums.length * 2];
        int counter = 0;
        while (counter != 2) {
            for (int i = 0; i < nums.length; i++) {
                copy[i + counter * nums.length] = nums[i];
            }
            counter++;
        }
        return copy;
    }

    public void solution() {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 3, 2, 1})));
    }
}
