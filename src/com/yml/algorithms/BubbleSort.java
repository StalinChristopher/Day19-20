package com.yml.algorithms;
import java.util.*;

/**
 * @author Stalin Christopher
 * class containing logic to sort integer elements using bubble sort
 */
public class BubbleSort {
	private static List<Integer> numberList = new ArrayList<Integer>();
	private static int n;
	
	public static void run() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list ");
		n = in.nextInt();
		System.out.println("Enter the elements of the list to be sorted");
		for(int i = 0 ;i < n; i++){
			numberList.add(in.nextInt());
		}
		System.out.println("Before sorting");
		printList();
		bubbleSort();
		System.out.println("\nAfter sorting");
		printList();
	}

	/**
	 * Method to print the list
	 */
	private static void printList() {
		for(int item : numberList){
			System.out.print(item+" ");
		}
	}

	/**
	 * Method to sort the list using buubleSort
	 */
	private static void bubbleSort(){
		for( int i = 0; i < n; i++){
			for( int j = 0 ; j < n-i-1; j++){
				if(numberList.get(j).compareTo(numberList.get(j+1))>0){
					int temp = numberList.get(j);
					numberList.set(j, numberList.get(j+1));
					numberList.set(j+1, temp);
				}
			}
		}
	}
}
