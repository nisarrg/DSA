package sorting;

public class Main {
    public static void main(String[] args) {

        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};
        int [] countSortArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        BubbleSort bubbleS = new BubbleSort();
        SelectionSort selectionS = new SelectionSort();
        InsertionSort insertionS = new InsertionSort();
        ShellSort shellS = new ShellSort();


        // Bubble Sort
        long begin = System.currentTimeMillis();
        bubbleS.sort();
        long end = System.currentTimeMillis();
        long timeTakenByBubbleSort = end - begin;
        System.out.println("Time elapsed by Bubble Sort: " + timeTakenByBubbleSort + " ms!");

        //Selection Sort
        begin = System.currentTimeMillis();
        selectionS.sort();
        end = System.currentTimeMillis();
        long timeTakenBySelectionSort = end - begin;
        System.out.println("Time elapsed by Selection Sort: " + timeTakenBySelectionSort + " ms!");

        //Insertion Sort
        begin = System.currentTimeMillis();
        insertionS.sort();
        end = System.currentTimeMillis();
        long timeTakenByInsertionSort = end - begin;
        System.out.println("Time elapsed by Selection Sort: " + timeTakenByInsertionSort + " ms!");

        //Shell Sort
        begin = System.currentTimeMillis();
        shellS.sort();
        end = System.currentTimeMillis();
        long timeTakenByShellSort = end - begin;
        System.out.println("Time elapsed by Shell Sort: " + timeTakenByShellSort + " ms!");

        //Merge Sort
        begin = System.currentTimeMillis();
        MergeSort.sort(arrayToSort, 0, arrayToSort.length);
        end = System.currentTimeMillis();
        long timeTakenByMergeSort = end - begin;
        System.out.println("Time elapsed by Merge Sort: " + timeTakenByMergeSort + " ms!");

        //Quick Sort
        System.out.println("========BEFORE SORTING========");
        for (int i : QuickSort.arrayToSort) {
            System.out.println(i);
        }

        begin = System.currentTimeMillis();
        QuickSort.quickSort(QuickSort.arrayToSort, 0, arrayToSort.length);
        end = System.currentTimeMillis();

        System.out.println("========AFTER SORTING========");
        for (int i : QuickSort.arrayToSort) {
            System.out.println(i);
        }

        long timeTakenByQuickSort = end - begin;
        System.out.println("Time elapsed by Quick Sort: " + timeTakenByQuickSort + " ms!");
    }
}