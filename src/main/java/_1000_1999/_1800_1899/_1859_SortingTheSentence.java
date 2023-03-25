package _1000_1999._1800_1899;

// 1859. Sorting the Sentence
public class _1859_SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] rightSent = new String[words.length];

        for (String word : words) {
            rightSent[Integer.parseInt(String.valueOf(word.charAt(word.length() - 1))) - 1] = word.substring(0, word.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rightSent.length; i++) {
            sb.append(rightSent[i]);
            if (i != rightSent.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));

    }
}
