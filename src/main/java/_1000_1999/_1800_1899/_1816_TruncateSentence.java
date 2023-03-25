package _1000_1999._1800_1899;

// 1816. Truncate Sentence
public class _1816_TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        if (words.length <= k) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));

    }
}
