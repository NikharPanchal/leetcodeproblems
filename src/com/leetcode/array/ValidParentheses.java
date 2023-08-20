package com.leetcode.array;

import java.util.Iterator;
import java.util.Stack;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 06-Aug-2023
*/
public class ValidParentheses {

	public static void main(String[] args) {
		String str="()";
		
		Stack<Character> stk=new Stack<Character>();
		char[] ch=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
		
		for(char c:ch)
		{
			System.out.println(c);
		}
	}

}
