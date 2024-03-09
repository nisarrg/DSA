package sorting;public class InsertionSort {    /*     * In-place algorithm     * Time Complexity: O(n^2) --> Quadratic     * Stable Algorithm     */    /*    ===========PSEUDO CODE=========    - firstUnsortedIndex = 1    - traverse through the unsorted partition until length of array    - newElement = array[firstUnsortedIndex]    - declare i    - SHIFTING ELEMENTS IN SORTED PARTITION --> traverse sorted partition until beginning of array:        - i = firstUnsortedIndex        - i > 0 and array[i-1] > newElement        - if true:            - array[i] = array[i - 1]    - array[i] = newElement    */    public void sort() {        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};        System.out.println("========BEFORE SORTING========");        for (int i : arrayToSort) {            System.out.println(i);        }        //sorting        // shrinks the unsorted part of array        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayToSort.length;             firstUnsortedIndex++) {            int newElement = arrayToSort[firstUnsortedIndex];            int i;            // shifts elements and adds the newElement to the sorted position            for (i = firstUnsortedIndex; i > 0 && arrayToSort[i - 1] > newElement; i--) {                arrayToSort[i] = arrayToSort[i - 1];            }            arrayToSort[i] = newElement;        }        System.out.println("========AFTER SORTING========");        for (int i : arrayToSort) {            System.out.println(i);        }        System.out.println("=====================");    }}