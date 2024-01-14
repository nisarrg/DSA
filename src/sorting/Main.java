package sorting;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        BubbleSort bs = new BubbleSort();

        long begin = System.currentTimeMillis();
        bs.sort(intArray);
        long end = System.currentTimeMillis();
        long bubbleTime = end - begin;

        System.out.println("Time elapsed: " + bubbleTime + " ms!");
    }
}