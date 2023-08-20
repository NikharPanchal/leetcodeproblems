package com.leetcode.tree;

/**
 * @objective Create a binary tree with no duplicate data
 * @Developer Nikhar
 * @Date 19-Aug-2023
 */
public class CreateBinaryTree {

	public static class Node {
		private Node left;
		private Node right;
		private int data;

		private Node(int data) {
			this.data = data;
		}

		// create binary tree
		public static Node createBinaryTree(Node root, int val) {
			// if root is null create a new node
			if (root == null) {
				Node node = new Node(val);
				return node;
			}

			if (root.data > val) {
				// root value > data create left tree of root node
				root.left = createBinaryTree(root.left, val);
			} else {
				// root value < data create left tree of root node
				root.right = createBinaryTree(root.right, val);
			}
			return root;
		}

		/*
		 * ------- inOrderTravel Scenario ------- 
		 * 1. left subtree 
		 * 2. root node 
		 * 3. right subtree
		 */
		public static void inOrderTravel(Node root) {
			if (root == null) {
				return;
			}
			inOrderTravel(root.left);
			System.out.print(root.data + " ");
			inOrderTravel(root.right);
		}
		
		/*
		 * ------- preOrderTravel Scenario ------- 
		 * 1. root node
		 * 2. left subtree   
		 * 3. right subtree
		 */
		public static void postOrderTravel(Node root) {
			if (root == null) {
				return;
			}
			postOrderTravel(root.left);
			postOrderTravel(root.right);
			System.out.print(root.data + " ");
		}
		
		/*
		 * ------- postOrderTravel Scenario ------- 
		 * 1. left subtree   
		 * 2. right subtree
		 * 3. root
		 */
		public static void preOrderTravel(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrderTravel(root.left);
			preOrderTravel(root.right);
		}

		public static void main(String[] args) {
			int[] arr = new int[] { 5, 1, 3, 4, 2, 7 };
			Node root = null;
			for (int i = 0; i < arr.length; i++) {
				root = createBinaryTree(root, arr[i]);
			}
			System.out.println("-- InOrder --");
			inOrderTravel(root);
			System.out.println("\n-- PreOrder --");
			preOrderTravel(root);
			System.out.println("\n-- PostOrder --");
			postOrderTravel(root);
		}
	}
}
