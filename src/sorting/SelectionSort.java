package sorting;

public class SelectionSort {
    /*
     * IN-place algorithm
     * Time Complexity --> O(n^2) : Quadratic
     * Less swapping than bubble sort
     * Unstable algorithm --> if same element is present at two indices, then the order is not guaranteed.
     * */


    public void sort(int[] arrayToSort) {

        System.out.println("========BEFORE SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }

        //sorting
        for (int lastUnsortedIndex = arrayToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            int largest = 0;

            for (int i = 1; i<= lastUnsortedIndex; i++) {
                if (arrayToSort[largest] < arrayToSort[i]) {
                        largest = i;
                }
            }

            swap(arrayToSort, largest, lastUnsortedIndex);
        }

        System.out.println("========AFTER SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }
        System.out.println("=====================");
    }

    public void swap(int[] originalArray, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = originalArray[i];
        originalArray[i] = originalArray[j];
        originalArray[j] = temp;
    }

}
