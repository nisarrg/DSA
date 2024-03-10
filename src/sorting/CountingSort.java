package sorting;

/*
 * Makes assumptions about the data
 * Doesn't use comparisons
 * Counts the number of occurrences of each value
 * Only works with non-negative discrete values (can't work with floats, strings)
 * Values must be within a specific range
 * Not an IN-place algorithm

 * Can achieve time complexity of O(n) --> because we are making assumptions about the data
 */

public class CountingSort {

    public static void sort(int[] arrayToSort, int min, int max) {
        System.out.println("========BEFORE SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }

        int[] countArray = new int[(max - min) + 1];

        for (int k : arrayToSort) {
            countArray[k - min]++;
        }

        int j = 0;
        for (int i = min; i < max; i++) {
            while (countArray[i - min] > 0) {
                arrayToSort[j++] = i;
                countArray[i - min]--;
            }
        }

        System.out.println("========AFTER SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }
    }
}


