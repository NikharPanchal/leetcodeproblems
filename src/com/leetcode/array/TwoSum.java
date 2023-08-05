package com.leetcode.array;

import java.util.Arrays;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 05-Aug-2023
*/
public class TwoSum {
	public static void main(String[] args) {
		int[] arr=new int[] {2,7,11,15};
		int[] twoSum = twoSum(arr, 9);
		Arrays.stream(twoSum).forEach(n->System.out.print(n));
    }
	
	public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(nums[i]+nums[j]==target)     
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}
