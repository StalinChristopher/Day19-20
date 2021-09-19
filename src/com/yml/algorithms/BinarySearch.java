package com.yml.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * @author Stalin Christopher
 * This class has the logic for binary search program
 */
public class BinarySearch {
    private static String wordArray[];
	
    /** 
     * @throws FileNotFoundException
     * static method run() called in main class 
     */
    public static void run() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
		readFromFile();
        sortArray();
        System.out.println("Enter the word to be searched");
        String inpuString = scanner.nextLine();
        scanner.close();
        boolean isFound = binarySearch(inpuString);
        if(isFound){
            System.err.println("Given word '"+inpuString+"' is found in the file");
        }else{
            System.out.println("Given word '"+inpuString+"' is not found in the file");
        }
	}
	
	
    /** 
     * @throws FileNotFoundException
     * method to read contents from the words.txt file and store it in a words array
     */
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("/Users/stalincd/Documents/Assignments/Day19-20/data/words.txt");
        Scanner in = new Scanner(file);
        String wordString = "";
        while(in.hasNext()){
            wordString = wordString + in.next();
        }
        wordArray = wordString.split(",");

        System.out.println("Array of words from the file are :");
        printArray();
	}

    /**
     * method to sort the words array
     */
    public static void sortArray(){
        int size = wordArray.length;
        for(int i = 0; i< size; i++){
            for(int j = 0; j < size-i-1; j++){
                if(wordArray[j].compareTo(wordArray[j+1])>0){
                    String temp = wordArray[j];
                    wordArray[j] = wordArray[j+1];
                    wordArray[j+1] = temp;
                }
            }
        }
        System.err.println("After sorting : ");
        printArray();
    }

    /**
     * Method to print the words array
     */
    public static void printArray(){
        for(String word : wordArray){
            System.out.println(word);
        }
    }

    
    /** 
     * @param word
     * @return boolean
     * method to conduct binary search operation to find if the given word is present or not
     */
    public static boolean binarySearch(String word){
        int low = 0;
        int high = wordArray.length-1;
        int middle = ( low + high ) / 2;
        while(low <= high){
            middle = ( low + high) / 2;
            if(wordArray[middle].compareTo(word) == 0){
                return true;
            }else if(wordArray[middle].compareTo(word) < 0){
                low = middle + 1;
            }else{
                high = middle - 1;
            }
        }
        return false;
    }
}
