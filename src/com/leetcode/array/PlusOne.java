package com.leetcode.array;

import java.util.Arrays;

/**
 * @objective
 * @Developer Nikhar
 * @Date 15-Aug-2023
 */
public class PlusOne {
	public static void main(String[] args) {
		int[] arr = new int[] { 9,9,9,9 };
		int[] plusOne = plusOne(arr);
		Arrays.stream(plusOne).forEach((n) -> System.out.print(n));
	}

	private static int[] plusOne(int[] digit) {
		for (int i = digit.length - 1; i >= 0; i--) {
			if (digit[i] < 9) {
				digit[i]++;	
				return digit;
			}
			digit[i]=0;
		}
		int[] newnum = new int[digit.length + 1];
		newnum[0] = 1;
		return newnum;
	}
}
