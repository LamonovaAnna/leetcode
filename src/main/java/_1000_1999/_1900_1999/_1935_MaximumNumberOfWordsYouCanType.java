package _1000_1999._1900_1999;

// 1935. Maximum Number of Words You Can Type
public class _1935_MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int[] alphabet = new int[26];
        String[] words = text.split(" ");
        int ans = 0;

        for (int i = 0; i < brokenLetters.length(); i++) {
            alphabet[brokenLetters.charAt(i) - 'a']++;
        }

        for (String word : words) {
            boolean found = false;
            for (int j = 0; j < word.length(); j++) {
                if (alphabet[word.charAt(j) - 'a'] > 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans++;
            }
        }
        return  ans;
    }

    public void solution() {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));

    }
}
