package _1000_1999._1500_1599;

//1528. Shuffle String
public class _1528_ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i  = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }

    public void solution() {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(restoreString("abc", new int[]{0, 1, 2}));
    }
}
