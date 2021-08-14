package learn.com.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
	int data;
	Node right,left;
	public Node(int item) {
		
		data = item;
		right = left = null;
		// TODO Auto-generated constructor stub
	}
}

public class BinaryTree {
	
	public static List<Integer> inorderTraversal(Node tree) {
        List<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        Node curr=tree;
        while(curr!=null || st.size()>0){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            Node l=st.pop();
            ans.add(l.data);
            curr=l.right;
        }
        ans.forEach(s->System.out.println(s));
        return ans;
    }
	
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree =  new Node(1);
		tree.left =  new Node(2);
		tree.right =  new Node(3);
		tree.left.left = new Node(4);
		tree.left.right =  new Node(5);
		tree.right.left = new Node(6);
		tree.right.right = new Node(7);
		inorderTraversal(tree);
		
		
	}

}
