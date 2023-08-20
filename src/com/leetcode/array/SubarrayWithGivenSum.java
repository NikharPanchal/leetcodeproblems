package com.leetcode.array;

/**
 * @objective
 * @Developer Nikhar
 * @Date 14-Aug-2023
 */
public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,7,5};//1,2,3,4,5,6,7,8,9,10
		int sum = 12;//15
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (count == sum) {
					System.out.println(count);	
					System.out.println((i+1)+":"+(j));
					return;
				} else {
					count += arr[j];
				}
			}
		}
	}
}
