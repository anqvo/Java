/**
 * Assignment: Binary Search Tree
 * Class: TreeTest.java
 * Author: An Vo
 * Date: 27 April 2015
 */



public class TreeTest {

	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();

		tree.insertNode(7);
		tree.insertNode(5);
		tree.insertNode(12);
		tree.insertNode(3);
		tree.insertNode(6);
		tree.insertNode(9);
		tree.insertNode(15);

		System.out.printf("%n%nPreOrder traversal%n");
		tree.preOrderTraversal();

		System.out.printf("%n%nInOrder traversal%n");
		tree.inOrderTraversal();

		System.out.printf("%n%nPostOrder traversal%n");
		tree.postOrderTraversal();
	}
	
}
