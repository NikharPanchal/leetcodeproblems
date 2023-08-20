package com.leetcode.array;

import com.leetcode.tree.CreateBinaryTree.Node;

/**
 * @objective
 * @Developer Nikhar
 * @Date 19-Aug-2023
 */
public class BinarySerachTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

	}

	private static TreeNode sortedArrayToBST(int[] arr, int start, int end) {
		if(start>end)
		{
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = sortedArrayToBST(arr, start, mid - 1);
		root.right = sortedArrayToBST(arr, mid + 1, end);
		return root;
	}
	
	/*
	 * ------- inOrderTravel Scenario ------- 
	 * 1. left subtree 
	 * 2. root node 
	 * 3. right subtree
	 */
	public static void inOrderTravel(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTravel(root.left);
		System.out.print(root.val + " ");
		inOrderTravel(root.right);
	}
	
	/*
	 * ------- preOrderTravel Scenario ------- 
	 * 1. root node
	 * 2. left subtree   
	 * 3. right subtree
	 */
	public static void postOrderTravel(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrderTravel(root.left);
		postOrderTravel(root.right);
		System.out.print(root.val + " ");
	}
	
	/*
	 * ------- postOrderTravel Scenario ------- 
	 * 1. left subtree   
	 * 2. right subtree
	 * 3. root
	 */
	public static void preOrderTravel(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preOrderTravel(root.left);
		preOrderTravel(root.right);
	}

	public static void main(String[] args) {
		int[] arr = new int[] {-10,-3,0,5,9};
		int start = 0;
		int end = arr.length-1;
		TreeNode root = sortedArrayToBST(arr, start, end);
		System.out.println("-- InOrder --");
		inOrderTravel(root);
		System.out.println("\n-- PreOrder --");
		preOrderTravel(root);
		System.out.println("\n-- PostOrder --");
		postOrderTravel(root);	
	}
}
