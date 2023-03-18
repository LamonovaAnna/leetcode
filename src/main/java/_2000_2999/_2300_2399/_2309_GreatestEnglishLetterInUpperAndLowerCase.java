package _2000_2999._2300_2399;

// 2309. Greatest English Letter in Upper and Lower Case
public class _2309_GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))) {
                lower[s.charAt(i) - 'a']++;
            }
            if(Character.isUpperCase(s.charAt(i))) {
                upper[s.charAt(i) - 'A']++;
            }
            if (lower[25] > 0 && upper[25] > 0) {
                return "Z";
            }
        }


        for (int i = 25; i > -1; i--) {
            if (lower[i] > 0 && upper[i] > 0) {
                return Character.toString(i + 'a').toUpperCase();
            }
        }
        return "";
    }

    public void solution() {
        System.out.println(greatestLetter("lEeTcOdE"));
        System.out.println(greatestLetter("arRAzFif"));
        System.out.println(greatestLetter("AbCdEfGhIjK"));
    }

}
