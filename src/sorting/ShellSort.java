package sorting;

public class ShellSort {
    /*
        *Variation of Insertion Sort for less shifting requirements
        * Shell sort starts with larger gap value
        * It does not compare values for neighbors, instead it picks elements that are far
        * Lots of ways to calculate gap and based on this time complexities also differ

        * One way is --> KNUTH SEQUENCE
        * Gap = (3^k - 1) / 2
        * Based on the number of elements , we set the K value

        * In-place algorithm
        * Time complexity depends on the gap. Worst Case scenario --> O(n^2)
        * Unstable algorithm
     */

    // initialize the gap value

    public void sort() {

        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("========BEFORE SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }

        for (int comparisionGap = arrayToSort.length / 2; comparisionGap > 0; comparisionGap /= 2) {

            for (int i = comparisionGap; i < arrayToSort.length; i++) {
                int newElement = arrayToSort[i];

                int j = i;

                while (j >= comparisionGap && arrayToSort[j - comparisionGap] > newElement) {
                    arrayToSort[j] = arrayToSort[j - comparisionGap];
                    j -= comparisionGap;
                }

                arrayToSort[j] = newElement;
            }
        }

        System.out.println("========AFTER SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }
        System.out.println("=====================");
    }
}
