package _1000_1999._1800_1899;

// 1832. Check if the Sentence Is Pangram
public class _1832_CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            alphabet[sentence.charAt(i) - 'a']++;
        }

        for (int j : alphabet) {
            if (j == 0) {
                return false;
            }
        }
        return true;
    }

    public void solution() {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }
}
