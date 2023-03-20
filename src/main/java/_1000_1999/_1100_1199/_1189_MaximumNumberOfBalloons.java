package _1000_1999._1100_1199;

// 1189. Maximum Number of Balloons
public class _1189_MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[5]; // balloon

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'b' -> letters[0]++;
                case 'a' -> letters[1]++;
                case 'l' -> letters[2]++;
                case 'o' -> letters[3]++;
                case 'n' -> letters[4]++;
            }
        }

        int counter = letters[0];
        for (int i = 1; i < letters.length; i++) {
            if (i == 1 || i == 4) {
                if (letters[i] < counter) {
                    counter = letters[i];
                }
            }
            if (i == 2 || i == 3) {
                if (letters[i] / 2 < counter) {
                    counter = letters[i] / 2;
                }
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));

    }
}
