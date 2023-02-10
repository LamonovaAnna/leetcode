package _0_999._300_399;

//383. Ransom Note
public class _383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(ransomNote);

        while (sb.length() != 0) {
            for(int i = 0; i < magazine.length(); i++) {
                if (sb.indexOf(String.valueOf(magazine.charAt(i))) != -1) {
                    sb.deleteCharAt(sb.indexOf(String.valueOf(magazine.charAt(i))));
                }
            }
            break;
        }

        return sb.length() == 0;
    }

    public void solution() {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("a", "b"));

    }



}
