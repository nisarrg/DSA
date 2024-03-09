package sorting;

public class MergeSort {

    /*
        * Divide and conquer algo
        * Recursive algo
        * Two phases: Splitting and Merging
        * Splitting is logical
        * Not In-place algorithm - Uses temporary arrays
        * Stable algorithm
        * Time Complexity --> O(nlogn){base 2}
    */

    public static void sort(int[] arrayToSort, int start, int end) {

        if ((end - start) < 2){
            return;
        }

        //partitioning
        int mid = (start + end) / 2;

        //left partition
        sort(arrayToSort, start, mid);

        //right partition
        sort(arrayToSort, mid, end);

        //merge left and right sorted partitions
        merge(arrayToSort, start, mid, end);
    }

    public static void merge (int[] input, int start, int mid, int end) {
        // if element before mid is smaller than the element at the mid, then the array is already sorted
        // two arrays (left and right) will be sorted already
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}
