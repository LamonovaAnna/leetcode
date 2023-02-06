import java.util.*;

//884. Uncommon Words from Two Sentences
public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> unique = new ArrayList<>();
        unique.addAll(List.of(s1.split(" ")));
        unique.addAll(List.of(s2.split(" ")));

        boolean flag = false;
        for (int i = 0; i < unique.size(); i++) {
            for (int j = i + 1; j < unique.size(); j++) {
                if (unique.get(i).equals(unique.get(j))) {
                    unique.remove(j);
                    flag = true;
                    j--;
                }
            }
            if (flag) {
                unique.remove(i);
                i--;
            }
            flag = false;
        }

        String[] result = new String[unique.size()];
        result = unique.toArray(result);

        return result;
    }

    public void solution() {
        System.out.println(Arrays.toString(uncommonFromSentences("fd kss fd", "fd fd kss")));
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(uncommonFromSentences("apple apple", "banana")));
    }


}

