package _2000_2999._2300_2399;

// 2315. Count Asterisks
public class _2315_CountAsterisks {
    public int countAsterisks(String s) {
        String[] words = s.split("\\|");
        int counter = 0;

        for (int i = 0; i < words.length; i = i + 2) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == '*') {
                    counter++;
                }
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("iamprogrammer"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }
}
