/**
 * Assignment: Binary Search Tree
 * Class: Tree.java
 * Author: An Vo
 * Date: 27 April 2015
 */



public class Tree<E extends Comparable<E>> {
	private BinarySearchTree<E> root;

	public Tree() {
		root = null;
	}

	public void insertNode(E insertValue) {
		if(root == null) {
			root = new BinarySearchTree<E>(insertValue);
		}
		else
			root.insert(insertValue);
	}

	public void preOrderTraversal() {
		preOrderHelper(root);
	}

	public void preOrderHelper(BinarySearchTree<E> node) {
		if(node == null) {
			return;
		}
		System.out.printf("%s ", node.data);
		preOrderHelper(node.leftSubtree);
		preOrderHelper(node.rightSubtree);
	}

	public void inOrderTraversal() {
		inOrderHelper(root);
	}

	public void inOrderHelper(BinarySearchTree<E> node) {
		if(node == null) {
			return;
		}
		inOrderHelper(node.leftSubtree);
		System.out.printf("%s ", node.data);
		inOrderHelper(node.rightSubtree);
	}

	public void postOrderTraversal() {
		postOrderHelper(root);
	}

	public void postOrderHelper(BinarySearchTree<E> node) {
		if(node == null) {
			return;
		}
		postOrderHelper(node.leftSubtree);
		postOrderHelper(node.rightSubtree);
		System.out.printf("%s ", node.data);
	}
}
