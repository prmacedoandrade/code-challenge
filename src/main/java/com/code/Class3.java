package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Solve the problem [Java]
//Given an array of integers arr, create a function that returns an array containing the values of arr without duplicates (the order doesn't matter).
//
//Example 1:
//
//Input: arr = [4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1]
//
//Output: [4, 2, 5, 3, 1]
//
//Example 2:
//
//Input: arr = [1, 1, 1, 1, 1, 1, 1, 1]
//
//Output: [1]
//
//Example 3:
//
//Input: arr = [4, 4, 2, 3, 2, 2, 4, 3]
//
//Output: [4, 2, 3]
public class Class3 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(removeDuplicates(new int[] { 4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1 })));
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 })));
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 4, 4, 2, 3, 2, 2, 4, 3 })));
		System.out.println("");
		System.out.println(
				Arrays.toString(removeDuplicatesChekingLast(new int[] { 4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1 })));
		System.out.println(Arrays.toString(removeDuplicatesChekingLast(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 })));
		System.out.println(Arrays.toString(removeDuplicatesChekingLast(new int[] { 4, 4, 2, 3, 2, 2, 4, 3 })));

	}

	public static int[] removeDuplicates(int[] arr) {

		Set<Integer> setRetun = new HashSet();

		for (int i = 0; i < arr.length; i++) {

			setRetun.add(arr[i]);

		}

		Integer[] integerArray = setRetun.toArray(new Integer[0]);
		int[] intArray = new int[setRetun.size()];

		for (int i = 0; i < integerArray.length; i++) {
			intArray[i] = integerArray[i];
		}

		return intArray;

	}
	
	//Just to make this for on arr
	public static int[] removeDuplicatesChekingLast(int[] arr) {

		if (arr.length == 0) {
			return new int[0];
		}

		Arrays.sort(arr);
		List<Integer> listReturn = new ArrayList();
		listReturn.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1]) {
				listReturn.add(arr[i]);
			}

		}

		Integer[] integerArray = listReturn.toArray(new Integer[0]);

		int[] intArray = new int[listReturn.size()];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = integerArray[i];
		}

		return intArray;

	}

}
