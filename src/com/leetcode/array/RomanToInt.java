package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @objective 
 * @Developer Nikhar
 * @Date 05-Aug-2023
*/
public class RomanToInt {
	public static void main(String[] args) {
		String s="X";
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);

//	        for(Map.Entry map1:map.entrySet())
//	        {
//	            System.out.println(map1.getKey()+":"+map1.getValue());
//	        }
	        
	        int result=map.get(s.charAt(s.length()-1));
	        for(int i=s.length()-2;i>=0;i--)
	        {
	        	if(map.get(s.charAt(i))<map.get(s.charAt(i+1))) 
	        	{
	        		result-=map.get(s.charAt(i));
	        	}else
	        	{
	        		result+=map.get(s.charAt(i));
	        	}
	        }
	        System.out.println(result);
	        
	}
}
