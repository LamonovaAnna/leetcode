package _2000_2999._2300_2399;

// 2351. First Letter to Appear Twice
public class _2351_FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        int[] alphabet = new int[26];

        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int letter = s.charAt(i) - 'a';
            if (alphabet[letter] > 0) {
                ans = s.charAt(i);
                break;
            }
            alphabet[letter]++;
        }
        return ans;
    }

    public void solution() {
        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));
    }
}
