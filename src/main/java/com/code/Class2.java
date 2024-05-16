package com.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Solve the problem [Java]
//Given an array of integers arr and an integer k, create a boolean function that checks if there exist two elements in arr such that we get k when we add them together.
//
//Example 1:
//
//Input: arr = [4, 5, 1, -3, 6], k = 11
//
//Output: true
//
//Explanation: 5 + 6 is equal to 11
//
//Example 2:
//
//Input: arr = [4, 5, 1, -3, 6], k = -2
//
//Output: true
//
//Explanation: 1 + (-3) is equal to -2
//
//Example 3:
//
//Input: arr = [4, 5, 1, -3, 6], k = 8
//
//Output: false
//
//Explanation: there is no pair that sums up to 8
public class Class2 {

	public static void main(String[] args) {

		System.out.println(findPairBrute(new int[] { 4, 5, 1, -3, 6 }, 11));
		System.out.println(findPairBetter(new int[] { 4, 5, 1, -3, 6 }, 11));
		System.out.println(findPairWithMap(new int[] { 4, 5, 1, -3, 6 }, 11));

	}

	public static boolean findPairBrute(int[] arr, int k) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == k) {
					return true;
				}

			}

		}

		return false;

	}

	//O(mLogn)
	public static boolean findPairBetter(int[] arr, int k) {

		int left = 0;
		int right = arr.length - 1;

		Arrays.sort(arr);

		while (left < right) {

			int sum = arr[left] + arr[right];

			if (arr[left] + arr[right] == k) {
				return true;
			} else if (sum < k) {
				left++;
			} else if (sum > k) {
				right--;;
			}

		}

		return false;

	}
	
	public static boolean findPairWithMap(int[] arr, int k) {

		
		Map<Integer, Boolean> map = new HashMap<>(); 
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(k-arr[i])) {
				return true;
			}
			
			map.put(arr[i], true);
			
		}

		return false;

	}
	

}
