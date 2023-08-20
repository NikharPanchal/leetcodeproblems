package com.leetcode.string;

/**
 * @objective
 * @Developer Nikhar
 * @Date 15-Aug-2023
 */
public class LengthOfLastWord {
	public static void main(String[] args) {
		int length = lengthOfLastWord("luffy is still joyboy");
		// System.out.println(length);
	}

	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				break;
			} else {
				count++;
			}
		}
		return count;
	}
}
