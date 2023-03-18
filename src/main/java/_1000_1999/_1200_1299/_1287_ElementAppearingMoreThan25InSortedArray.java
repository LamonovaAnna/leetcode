package _1000_1999._1200_1299;

//1287. Element Appearing More Than 25% In Sorted Array
public class _1287_ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int qutElements = arr.length / 4;

        int ans = -1;
        if (qutElements < 1) {
            return arr[0];

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + qutElements]) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    public void solution() {
        System.out.println(findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
        System.out.println(findSpecialInteger(new int[]{1, 1}));
    }
}
