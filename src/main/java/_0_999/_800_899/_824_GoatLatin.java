package _0_999._800_899;

// 824. Goat Latin
public class _824_GoatLatin {
    public String toGoatLatin(String sentence) {
        final String VOWELS = "aeiou";
        String[] words = sentence.split(" ");
        StringBuilder sbWord = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (VOWELS.indexOf(Character.toLowerCase(words[i].charAt(0))) != -1) {
                sbWord.append(words[i]);
            } else {
                char fLetter = words[i].charAt(0);
                sbWord.append(words[i].substring(1)).append(fLetter);
            }
            sbWord.append("ma");

            int counter = 1;
            while (counter < i + 2) {
                sbWord.append('a');
                counter++;
            }

            ans.append(sbWord).append(' ');
            sbWord = new StringBuilder();
        }

        return ans.deleteCharAt(ans.length() - 1).toString();
    }

    public void solution() {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
}
