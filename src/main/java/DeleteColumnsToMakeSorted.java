//944. Delete Columns to Make Sorted
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int counter = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            boolean sorted = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    sorted = false;
                    break;
                }
            }
            if (!sorted) {
                counter++;
            }
        }
        return counter;
    }

    public void solution() {
        System.out.println(minDeletionSize(new String[] {"cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[] {"a","b"}));
        System.out.println(minDeletionSize(new String[] {"zyx","wvu","tsr"}));
    }
}
