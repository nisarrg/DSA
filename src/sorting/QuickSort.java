package sorting;

public class QuickSort {
    /*
        * Divide and Conquer Algo
        * Recursive Algo
        * Uses pivot element to divide the array
        * In-place algo
        * Time COmplexity --> O(logn) : Base2
        * Worst case --> O(n^2)
        * But, most of the times, it performs better than merge sort
        * It is an unstable algo
        * Position of pivot affects time complexity
    */

    public static int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

    public static void quickSort (int[] arrayToSort, int start, int end) {

        System.out.println("========BEFORE SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }

        if ((end - start) < 2) {
            return;
        }

        int pivotIndex = partition(arrayToSort, start, end);
        quickSort(arrayToSort, start, pivotIndex);

        //element at pivot index is already in sorted position, so, we dont include that element
        quickSort(arrayToSort, pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using start index of the array as pivot element

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //empty body loop
            //prefix decrement is used to avoid array out of bound error
            while (i < j && input[--j] >=pivot);

            if (i<j) {
                input[i] = input[j];
            }

            //empty loop
            while (i<j && input[++i] <= pivot);

            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
