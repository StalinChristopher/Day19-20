package com.yml.main;

import java.io.FileNotFoundException;

import com.yml.algorithms.Anagram;
import com.yml.algorithms.BinarySearch;
import com.yml.algorithms.BubbleSort;
import com.yml.algorithms.FindNumber;
import com.yml.algorithms.Generics;
import com.yml.algorithms.InsertionSort;
import com.yml.algorithms.MergeSort;
import com.yml.algorithms.PrimeNumbers;
import com.yml.algorithms.PrimeNumbersPalindrome;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to algorithm programs");

		// BinarySearch.run();

		// InsertionSort.run();

		// BubbleSort.run();

		// MergeSort.run();

		// Anagram.run();

		// PrimeNumbers.run();

		// PrimeNumbersPalindrome.run();

		// Generics.run();

		FindNumber.run(args[0]);
	}

}
