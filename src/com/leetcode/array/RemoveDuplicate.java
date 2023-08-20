package com.leetcode.array;

import java.util.Arrays;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 06-Aug-2023
*/
public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr=new int[] {0,0,1,1,1,2,2,3,3,4};
		int k=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[k]=arr[i];
				k++;
			}
		}
		System.out.println(k);
		Arrays.stream(arr).forEach((n)->System.out.print(n));
	}
}
