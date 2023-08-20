package com.leetcode.array;

/**
 * @objective
 * @Developer Nikhar
 * @Date 14-Aug-2023
 */
public class SearchInsertPosition {
	public static void main(String[] args) {
		int nums[]= {1,3,5,6};
		int insertElement = insertElement(nums, 5);
		System.out.println(insertElement);
	}

	public static int insertElement(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(nums[mid]==target)
			{
				return mid;
			}	
			else if(nums[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return target;
	}
}
