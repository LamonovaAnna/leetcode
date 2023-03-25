package _2000_2999._2500_2599;

// 2586. Count the Number of Vowel Strings in Range
public class _2586_CountTheNumberOfVowelStringsInRange {
    public int vowelStrings(String[] words, int left, int right) {
        int counter = 0;
        String vowels = "aeiou";
        for (int i = left; i <= right; i++) {
            if (vowels.indexOf(words[i].charAt(0)) != -1 &&
                    vowels.indexOf(words[i].charAt(words[i].length() - 1)) != -1) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(vowelStrings(new String[] {"are","amy","u"}, 0, 2));
        System.out.println(vowelStrings(new String[] {"hey","aeo","mu","ooo","artro"}, 1, 4));
    }
}
