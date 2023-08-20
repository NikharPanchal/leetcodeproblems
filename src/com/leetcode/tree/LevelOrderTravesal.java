package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @objective
 * @Developer Nikhar
 * @Date 20-Aug-2023
 */
public class LevelOrderTravesal {
	public static class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		private TreeNode() {
		}

		private TreeNode(int val) {
			this.val = val;
		}

		private TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		public static void main(String[] args) {
			Integer[] arr = new Integer[] { 3, 9, 20, 15, 7 };
			TreeNode root = null;
			for (int i = 0; i < arr.length; i++) {
				root = createBinaryTree(root, arr[i]);
			}
			List<List<Integer>> levelOrderTravesal = levelOrderTravesal(root);
			System.out.println(levelOrderTravesal.toString());
		}

		private static List<List<Integer>> levelOrderTravesal(TreeNode root) {
//			Queue<TreeNode> q = new LinkedList<LevelOrderTravesal.TreeNode>();
//			q.add(root);
//			q.add(null);
//
//			while (!q.isEmpty()) {
//				TreeNode curr = q.remove();
//				if (curr == null) {
//					System.out.println();
//					if (q.isEmpty()) {
//						break;
//					} else {
//						q.add(null);
//					}
//				} else {
//					System.out.print(curr.val);
//					if (curr.left != null) {
//						q.add(curr.left);
//					}
//					if (curr.right != null) {
//						q.add(curr.right);
//					}
//				}
//			}
//			return null;
//		}
			Queue<TreeNode> q = new LinkedList<>();
			List<List<Integer>> list = new LinkedList<List<Integer>>();
			if (root == null) {
				return list;
			}
			q.add(root);
			while (!q.isEmpty()) {
				List<Integer> subLevel = new LinkedList<>();
				for (int i = 0; i < q.size(); i++) {
					TreeNode curr = q.poll();
					if (curr.left != null) {
						q.add(curr.left);
					}
					if (curr.right != null) {
						q.add(curr.right);
					}
					subLevel.add(curr.val);
				}
				list.add(subLevel);
			}
			return list;
		}

		public static TreeNode createBinaryTree(TreeNode root, int val) {
			// if root is null create a new node
			if (root == null) {
				TreeNode node = new TreeNode(val);
				return node;
			}

			if (root.val > val) {
				// root value > data create left tree of root node
				root.left = createBinaryTree(root.left, val);
			} else {
				// root value < data create left tree of root node
				root.right = createBinaryTree(root.right, val);
			}
			return root;
		}
	}
}