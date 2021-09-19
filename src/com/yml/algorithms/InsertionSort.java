package com.yml.algorithms;

import java.util.Scanner;

/**
 * @author Stalin Christopher
 * Class which contains logic for insertion sort program
 */
public class InsertionSort {
	private static String wordArray[];
	private static int n;
	
	
	public static void run() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of words in the array");
		n = in.nextInt();
		wordArray = new String[n];
		System.out.println("Enter the words to be sorted");
		for(int i = 0; i < n; i++){
			wordArray[i] = in.next();
		}
		System.out.println("\nBefore sorting\n");
		printArray();
		insertionSort();
		System.out.println("\nAfter sorting\n");
		printArray();
	}

	/**
	 * Method to sort the array using insertion sort
	 */
	private static void insertionSort() {
		for(int i=1; i < n; i++) {
			String word = wordArray[i];
			int j = i-1;
			while(j >= 0 && wordArray[j].compareTo(word)>0) {
				wordArray[j+1] = wordArray[j];
				j = j - 1;
			}
			wordArray[j+1] = word;
		}
	}

	/**
	 * Method to print the array
	 */
	private static void printArray(){
		for(String word : wordArray){
			System.out.println(word);
		}
	}
}
