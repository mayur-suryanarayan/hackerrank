package days.day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {

	static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		
		if(root.left != null && root.right != null) {
			queue.add(root);
			while(!queue.isEmpty()) {
				Node tree = queue.remove();
				System.out.print(tree.data + " ");
				if(tree.left != null) {
					queue.add(tree.left);
				}
				if(tree.right != null) {
					queue.add(tree.right);
				}
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}
}