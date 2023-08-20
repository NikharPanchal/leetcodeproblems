package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 16-Aug-2023
*/
public class LengthOfLongetSubstring {
	public static void main(String[] args) {
		int longestSubString = longestSubString("abcabcabc");
		System.out.println(longestSubString);
	}
	
	public static int longestSubString(String s) {
		int start=0;
        int end=0;
        int max_length=0;
        List<Character> list=new ArrayList<Character>();
        while(end<s.length())
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
	}
}
