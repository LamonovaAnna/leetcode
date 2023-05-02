package _1000_1999._1300_1399;

import java.util.Arrays;

// 1346. Check If N and Its Double Exist
public class _1346_CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        boolean isFound = false;
        for (int i = 0; i < arr.length; i++)  {
            int target = arr[i] * 2;
            if (arr[arr.length - 1] == target) {
                return true;
            } else if (target == 0) {
                if (i == 0) {
                    if (arr[1] == 0) {
                        isFound = true;
                    }
                } else {
                    if (arr[i - 1] == 0 || arr[i + 1] == 0) {
                        isFound = true;
                    }
                }
            } else if (arr[arr.length - 1] > target) {
                isFound = binarySearch(target, arr);
            }
            if (isFound) {
                break;
            }
        }

        return isFound;
    }

    private boolean binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[left] == target || arr[right] == target || arr[mid] == target) {
                return true;
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public void solution() {
        System.out.println(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }
}
