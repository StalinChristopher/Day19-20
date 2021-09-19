package com.yml.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
    private static String[] stringArray = { "hello", "good", "better", "best", "happy", "cheerful", "orange", "zebra" };
    private static Integer[] integerArray = { 1, 43, 12, 65, 32, 98, 56, 21, 54 };

    public static void run() {
        System.out.println("\nBinary Search");
        binarySearch(stringArray, "better");
        System.out.println("\nInsertion Sort");
        insertionSort(integerArray);
        System.out.println("\nBubble sort");
        bubbleSort(integerArray);
        System.out.println("\nMerge Sort");
        Integer[] arr = mergeSort(integerArray, 0, integerArray.length - 1);
        printArray(arr);

    }

    /**
     * @param <T>
     * @param array
     * @param element
     * Method to search an element using binary search
     */
    public static <T extends Comparable<T>> void binarySearch(T[] array, T element) {

        int length = array.length;
        T temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (array[mid].compareTo(element) == 0) {
                System.out.println("'" + element + "' found at position " + (mid + 1));
                return;
            } else if (array[mid].compareTo(element) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(element + " not found");
        printArray(array);
    }

    /**
     * @param <T>
     * @param array
     * Method to sort the elements using bubbleSort
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int length = array.length;
        T temp;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    /**
     * @param <T>
     * @param array
     * Method to sort the elements using insertionSort
     */
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            T word = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(word) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = word;
        }
        printArray(array);
    }

    /**
     * @param <T>
     * @param array
     * @param start
     * @param end
     * @return
     * Method to sort the elements using merge Sort
     */
    public static <T extends Comparable<T>> T[] mergeSort(T[] array, int start, int end) {
        if (start == end) {
            return array;
        }
        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
        return array;
    }

    public static <T extends Comparable<T>> void merge(T[] a, int start, int mid, int end) {
        int count = end - start + 1;
        List<T> b = new ArrayList<T>();
        int loop1 = start;
        int loop2 = mid + 1;

        while (loop1 <= mid && loop2 <= end) {
            if (a[loop1].compareTo(a[loop2]) < 0) {
                b.add(a[loop1]);
                loop1++;
            } else {
                b.add(a[loop2]);
                loop2++;
            }
        }

        while (loop1 <= mid) {
            b.add(a[loop1]);
            loop1++;
        }

        while (loop2 <= end) {
            b.add(a[loop2]);
            loop2++;
        }

        for (int i = 0; i < count; i++) {
            a[start + i] = b.get(i);
        }
    }

    /**
     * @param <T>
     * @param array
     * Method to print the elements of the array
     */
    private static <T extends Comparable<T>> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
    }
}
