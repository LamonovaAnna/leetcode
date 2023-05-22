package _1000_1999._1900_1999;

// 1941. Check if All Characters Have Equal Number of Occurrences
public class _1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length - 1; i++) {
            if (alphabet[i] != 0 && alphabet[i + 1] != 0 && alphabet[i] != alphabet[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(areOccurrencesEqual("aca"));
    }
}
