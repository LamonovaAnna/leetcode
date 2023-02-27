package _0_999._500_599;

// 504. Base 7
public class _504_Base7 {
    public String convertToBase7(int num) {
        int counter = 1;
        int result = 0;

        while (num != 0) {
            int reminder = num - (num / 7 * 7);
            num = num / 7;
            result = result + (counter * reminder);
            counter *= 10;
        }
        return String.valueOf(result);
    }

    public void solution() {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
    }

}
