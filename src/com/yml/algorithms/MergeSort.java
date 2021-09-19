package com.yml.algorithms;

import java.util.Scanner;

public class MergeSort {
    private static String wordArray[];
    private static int n;

    public static void run(){
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of words in the array");
		n = in.nextInt();
		wordArray = new String[n];
		System.out.println("Enter the words to be sorted");
		for(int i = 0; i < n; i++){
			wordArray[i] = in.next();
		}
		System.out.println("\nBefore sorting");
		printArray();
		mergeSort(wordArray,0,n-1);
		System.out.println("\nAfter sorting\n");
		printArray();
    }

    /**
     * Method to print the elements of array
     */
    private static void printArray() {
        for(String word : wordArray){
			System.out.println(word);
		}
    }

    
    /** 
     * @param array
     * @param start
     * @param end
     * Metho to sort the elements in the array
     */
    private static void mergeSort(String[] array, int start, int end) {
        if(start == end){
            return;
        }
        if( start < end){
            int mid = (start + end)/2;
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
        
    }

    
    /** 
     * @param array
     * @param start
     * @param mid
     * @param end
     * Method to merge the sorted elements and place it in the original array
     */
    private static void merge(String[] array,int start, int mid, int end){
            int n1 = mid-start+1;
            int n2 = end-mid;

            String B[] = new String[n1];
            String C[] = new String[n2];

            for(int i = 0; i< n1; i++){
                B[i] = array[start+i];
            }
            for(int j = 0; j< n2; j++){
                C[j] = array[mid + 1 + j ];
            }
            int i = 0, j = 0;
            int k = start;
            while( i < n1 && j < n2){
                if(B[i].compareTo(C[j])<0){
                    array[k] = B[i];
                    i++;
                }else{
                    array[k] = C[j];
                    j++;
                }
                k++;
            }
            while(i < n1){
                array[k] = B[i];
                i++;
                k++;
            }
            while(j<n2){
                array[k] = C[j];
                j++;
                k++;
            }
    }
}
