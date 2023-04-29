package _2000_2999._2600_2699;

// 2645. Minimum Additions to Make Valid String
public class _2645_MinimumAdditionsToMakeValidString {
    public int addMinimum(String word) {
        if (word.length() == 1) {
            return 2;
        }
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                if (i == word.length() - 1) {
                    ans += 2;
                } else if (i == word.length() - 2) {
                    if (word.charAt(i + 1) == 'a') {
                        ans += 2;
                    } else {
                        ans++;
                        i++;
                    }
                } else {
                    if (word.charAt(i + 1) == 'b') {
                        if (word.charAt(i + 2) != 'c') {
                            ans++;
                        } else {
                            i++;
                        }
                        i++;
                    } else if (word.charAt(i + 1) == 'c') {
                        ans++;
                        i++;
                    } else {
                        ans += 2;
                    }
                }

            } else if (word.charAt(i) == 'b') {
                if (i == word.length() - 1 || word.charAt(i + 1) != 'c') {
                    ans += 2;
                } else if (word.charAt(i + 1) == 'c') {
                    ans++;
                    i++;
                }

            } else {
                ans += 2;
            }
        }

        return ans;
    }

    public void solution() {
        System.out.println(addMinimum("aaabbc"));
        System.out.println(addMinimum("aaaaab"));
        System.out.println(addMinimum("aaa"));
        System.out.println(addMinimum("aaaabb"));
    }
}
