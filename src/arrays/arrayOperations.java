package arrays;

import java.util.Arrays;

/*
TIME COMPLEXITIES OF ARRAY OPERATIONS:
    * Retrieving element at known index: O(1)
    * Retrieving element at unknown index: O(n)
    * Adding element to full array: O(n)
    * Adding element to end of an array (has space): O(1)
    * Insert/Update element at known index: O(1)
    * Delete element by setting it to null: O(1)
    * Delete element and shit elements to the left: O(n)
*/

public class arrayOperations {
    // TODO : Perform above array operations.
    public void addElementToFullArray (int[] originalArray, int elementToAdd) {
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[originalArray.length] = elementToAdd;

        for (int i : newArray) {
            System.out.println(i);
        }
        System.out.println("===================");
    }

    public void addElementToEmptyArray (int[] originalArray, int elementTOAdd) {
        for (int i=0; i < originalArray.length; i++) {
            if (originalArray[i] == 0) {
                originalArray[i] = elementTOAdd;
                break;
            }
        }

        for (int i : originalArray) {
            System.out.println(i);
        }
        System.out.println("===================");
    }

    public void updateElement (int[] originalArray, int index, int elementToAdd) {
        originalArray[index] = elementToAdd;

        for (int i : originalArray) {
            System.out.println(i);
        }
        System.out.println("===================");
    }

    public void setElementToNull (int[] originalArray, int index) {
        originalArray[index] = 0;

        for (int i : originalArray) {
            System.out.println(i);
        }
        System.out.println("===================");
    }

    public void removeElement (int[] originalArray, int elementToRemove){
        int[] updatedArray = new int[originalArray.length - 1];
        for (int i = 0, k = 0; i < originalArray.length; i++) {
            if (originalArray[i] != elementToRemove) {
                updatedArray[k] = originalArray[i];
                k++;
            }
        }

        for (int i : updatedArray) {
            System.out.println(i);
        }
        System.out.println("===================");
    }

}