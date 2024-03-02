//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 8;
		arr[4] = 13;
		arr[5] = 6;
		// 2. Print out the first element in the array
		System.out.println(arr[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(arr[arr.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(arr[6]);
		//throws ArrayIndexOutOfBoundsException
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(arr[-1]);
		//throws ArrayIndexOutOfBoundsException
			
		// 6. Write a traditional for loop that prints out each element in the array
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for(int i:arr) {
			System.out.println(i);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for(int i:arr) {
			sum+=i;
		}
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double ave = (double)sum/arr.length;
		System.out.println(ave);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int i:arr) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int nSum = 0;
		for(String i:names) {
			nSum += i.length();
		}
		System.out.println(nSum);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greeting(names[0]);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(sGreeting(names[1]));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		/*
		 *      one returns a string that can be stored and used for other methods
		 *      while the other only has its one use
		 */
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isBigger(names[2], 4));
		System.out.println(isBigger(names[2], 7));
		System.out.println(isBigger(names[2], 6));
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(isPresent(names, "Thomas"));
		System.out.println(isPresent(names, "thomas"));
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(smallest(arr));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] data = {3.42,5.67,20.4,13.6,8.24};
		System.out.println(average(data));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		for(int ix:lengths(names)) {
			System.out.print(ix+ " ");
		}
		System.out.println();
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(isMoreEven(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("Racecar"));
		System.out.println(isPalindrome("madman"));
		System.out.println(isPalindrome("peep"));
		
	}
	

	
	// Method 13:
	public static void greeting(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String sGreeting(String name) {
		return "Hello, " + name + "!";
	}
	
	// Method 15:
	public static boolean isBigger(String x, int i) {
		return x.length() > i;
	}
	
	// Method 16:
	public static boolean isPresent(String[] data, String target) {
		for(String ix:data) {
			if(ix.equals(target)) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	public static int smallest(int[] data) {
		int small = data[0];
		for(int ix:data) {
			if(small > ix) {
				small = ix;
			}
		}
		return small;
	}
	
	// Method 18:
	public static double average(double[] data) {
		double sum = 0;
		double ave;
		for(double ix:data) {
			sum+=ix;
		}
		ave = sum/data.length;
		return ave;
	}
	
	// Method 19:
	public static int[] lengths(String[] data) {
		int[] lengths = new int[data.length];
		for(int ix = 0; ix<data.length;ix++) {
			lengths[ix] = data[ix].length();
		}
		return lengths;
	}
	
	// Method 20:
	public static boolean isMoreEven(String[] data) {
		int even = 0;
		int odd = 0;
		for(String ix:data){
			if(ix.length()%2 == 0) 
				even++;			
			else
				odd++;
		}
		return even > odd;
	}
	
	// Method 21:
	public static boolean isPalindrome(String word) {
		char[] arr = word.toLowerCase().toCharArray();
		for(int ix = 0; ix < arr.length/2; ix++) {
			if(arr[ix]!=arr[arr.length-(ix+1)])
				return false;
		}		
		return true;
	}
}