package _2000_2999._2300_2399;

// 2390. Removing Stars From a String
public class _2390_RemovingStarsFromAString {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                counter++;
            } else if (counter == 0) {
                sb.append(s.charAt(i));
            } else {
                counter--;
            }
        }

        return sb.reverse().toString();
    }

    public void solution() {
        System.out.println(removeStars("leet**cod*e")); // "lecoe"
        System.out.println(removeStars("erase*****"));
    }
}
