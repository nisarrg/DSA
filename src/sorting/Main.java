package sorting;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();

        long begin = System.currentTimeMillis();
        bs.sort(intArray);
        long end = System.currentTimeMillis();
        long bubbleTime = end - begin;

        System.out.println("Time elapsed by Bubble Sort: " + bubbleTime + " ms!");

        begin = System.currentTimeMillis();
        ss.sort(intArray);
        end = System.currentTimeMillis();
        long selectionTime = end - begin;

        System.out.println("Time elapsed by Selection Sort: " + selectionTime + " ms!");
    }
}