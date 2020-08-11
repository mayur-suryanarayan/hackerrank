package days.day22;

import java.util.Scanner;

class Solution{

	public static int getHeight(Node root){
		if (root == null) {
			return -1;
		}else {
			int leftHeight = getHeight(root.left) + 1;
			int rightHeight = getHeight(root.right) + 1;
			return Math.max( leftHeight, rightHeight);
		}
    }
	
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        int height=getHeight(root);
        System.out.println(height);
    }
}
