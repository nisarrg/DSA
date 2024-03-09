package arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ADVANTAGES:
            Arrays are not dynamic --> you need to specify the size which will not be increased/decreased
            Time Complexity --> O(1) : Constant TIme Complexity
            Arrays are very useful when index location of the time is known.
            Very useful in data retrieval in such cases.

        DISADVANTAGES:
            In cases where the location of the data item is unknown, Time Complexity becomes O(n) --> Linear Time Complexity
         */

        int[] intArray = new int[10];

        intArray[0] = 20;
        intArray[1] = 72;
        intArray[2] = 4;
        intArray[3] = 837;
        intArray[4] = -67;
        intArray[5] = 722;
        intArray[6] = -25;

        // enhanced for loop --> known as 'for-each' loop
        for (int j : intArray) {
            System.out.println(j);
        }

        /*
         * Creating Dynamic Arrays --> ArrayList
         * While this is dynamic, the speed is comparatively slower than normal arrays because of object methods
         */

        ArrayList <Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(5);
        dynamicArray.add(20);
        dynamicArray.add(-88);
        dynamicArray.add(204);
        dynamicArray.add(98);
        dynamicArray.add(-34);

        for (int i : dynamicArray) {
            System.out.println(i);
        }

        arrayOperations ao = new arrayOperations();
        ao.addElementToFullArray(intArray, 5);
        ao.addElementToEmptyArray(intArray, 20);
        ao.updateElement(intArray, 3, 87);
        ao.setElementToNull(intArray, 4);
        ao.removeElement(intArray, 20);
    }
}