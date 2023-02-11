package _2000_2999._2100_2199;

//2114. Maximum Number of Words Found in Sentences
public class _2114_MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            String[] splited = sentence.split(" ");
            if (splited.length > max) {
                max = splited.length;
            }
        }
        return  max;
    }

    public void solution() {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode",
                "i think so too", "this is great thanks very much"}));
        System.out.println(mostWordsFound(new String[]{"please wait","continue to fight","continue to win"}));
    }
}
