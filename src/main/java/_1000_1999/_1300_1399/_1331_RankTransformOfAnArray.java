package _1000_1999._1300_1399;

import java.util.Arrays;

// 1331. Rank Transform of an Array
public class _1331_RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }
        if(arr.length == 1) {
            return new int[] {1};
        }
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.parallelSort(sortedArr);
        sortedArr = removeDuplicate(sortedArr);

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {;
            ans[i] = searchIndex(arr[i], sortedArr);
        }
        return ans;
    }

    private int[] removeDuplicate(int[] arr) {
        int index = 0;
        int duplicateCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index] = arr[i];
                index++;
            } else {
                duplicateCounter++;
            }
        }
        arr[index] = arr[arr.length - 1];

        return Arrays.copyOfRange(arr, 0, arr.length - duplicateCounter);
    }

    private int searchIndex(int val, int[] arr) {
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[left] == val) {
                ans = left;
                break;
            }
            if (arr[right] == val) {
                ans = right;
                break;
            }
            if (arr[mid] == val) {
                ans = mid;
                break;
            }

            if (arr[mid] > val) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans + 1;
    }


    public void solution() {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100, 100, 100})));

        System.out.println(Arrays.toString(arrayRankTransform(new int[]{7,-10,9,36,43,2,37,44,43,-38,29,-44,19,38,49,-20,19,18,29,-12})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40, 10, 20, 30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})));
        // [5,3,4,2,8,6,7,1,3]
    }
}
