package sorting;

public class BubbleSort {
    /*
     * Its performance degrades quickly as the size of the data structure increases
     * It is in-place algorithm:
         For sorting, we don't need to create any copy of the data structure

     *TIME COMPLEXITY --> O(n^2) : Quadratic
     *
     *
     */

    /*
    ===========PSEUDO CODE=========
        procedure bubbleSort( list : array of items )

           loop = list.count;

           for i = 0 to loop-1 do:
              swapped = false
              for j = 0 to loop-1 do:
                 // compare the adjacent elements
                 if list[j] > list[j+1] then
                    // swap them
                    swap( list[j], list[j+1] )
                    swapped = true
                end if
            end for

              // if no number was swapped that means array is sorted now, break the loop.
                if(not swapped) then
                 break
                end if
            end for
    end procedure return list
    */

    // CODE STARTS HERE

    public void sort(int[] arrayToSort) {

        System.out.println("========BEFORE SORTING========");
        for (int i : arrayToSort) {
            System.out.println(i);
        }

        for (int lastUnsortedIndex = arrayToSort.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    swap(arrayToSort, i, i + 1);
                }
            }
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