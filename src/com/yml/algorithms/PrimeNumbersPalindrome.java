package com.yml.algorithms;

public class PrimeNumbersPalindrome {
	public static int min = 0;
	public static int max = 1000;
	
	public static void run() {
		
		System.out.println("Prime Numbers between "+min+" & "+max+" are");
		primeNumber();
	}

	/**
	 * this method is used check and display the prime numbers between 
	 * 0 and 1000
	 */
	public static void primeNumber() {
		if(min < 2) {
			min = 2;
		}
		
		for(int i= min; i < max ; i++) {
			boolean primeNo = true;
			for(int j = 2; j < i/2 ; j++) {
				if(i % j == 0) {
					primeNo = false;
					break;
				}
			}
			if(primeNo) {
				palindrome(i);
			}
		}
	}
	
	/**this method is used to display all the prime numbers that are palindrome
	 * @param n
	 */
	public static void palindrome(int n) {
		int num = n;
		int rev = 0;
		
		while(n != 0) {
			int digit = n % 10;
			rev = (rev * 10) + digit;
			n = n/10;
		}
		
		if(num == rev) {
			System.out.println(num+" ");
		}
	}
}
