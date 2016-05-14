/**
 * Assignment: Binary Search Tree
 * Class: BinarySearchTree.java
 * Author: An Vo
 * Date: 27 April 2015
 */



import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<E>> {

	protected E data;
	protected BinarySearchTree<E> leftSubtree, rightSubtree;
	
	/**
	 * Initialize the BST with the given data. Both
	 * the left and right subtrees should initially
	 * be null.
	 *
	 * @param datum The node's data.
	 */
	public BinarySearchTree(E datum) {
		this.data = datum;
		// leftSubtree = rightSubtree = null;
		this.leftSubtree = null;
		this.rightSubtree = null;
	}	// end constructor
	
	/**
	 * Inserts a new data item to the tree.
	 *
	 * @param datum The value to insert.
	 */
	public void insert(E datum){
		// insert in leftSubtree
		if(datum.compareTo(data) < 0) {
			// insert new BinarySearchTree
			if(leftSubtree == null) {
				leftSubtree = new BinarySearchTree<E>(datum);
			}
			// recursively traverse through leftSubtree
			else
				leftSubtree.insert(datum);
		}
		// insert in rightSubtree
		else if(datum.compareTo(data) > 0) {
			// insert new BinarySearchTree
			if(rightSubtree == null) {
				rightSubtree = new BinarySearchTree<E>(datum);
			}
			// recursively traverse through rightSubtree
			else
				rightSubtree.insert(datum);
		}
		
		// return; (not certain why Dr. Summa included this return when method is void)
	}	// end method insert()
	
	/**
	 * Returns true if the searchValue is in the tree or
	 * false otherwise. This method will implement the
	 * recursive binary search algorithm.
	 *
	 * @param searchValue The value to search for.
	 * @return Whether the searchValue is in the BST.
	 */
	public boolean contains(E searchValue){
		// check if both values are identical
		if(searchValue.compareTo(data) == 0) {
			return true;
		}
		// check leftSubtree
		else if(searchValue.compareTo(data) < 0) {
			// value does not exist in leftSubtree
			if(leftSubtree == null) {
				return false;
			}
			//	recursively traverse through leftSubtree
			else
				leftSubtree.contains(searchValue);
		}
		//check rightSubtree
		else if(searchValue.compareTo(data) > 0) {
			// value does not exist in rightSubtree
			if(rightSubtree == null) {
				return false;
			}
			// recursively traverse through rightSubtree
			else
				rightSubtree.contains(searchValue);
		}
		return false;
	}
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the in-order approach.
	 */
	public Iterator<E> getInOrderIterator(){		
		return null;
	}
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the pre-order approach.
	 */
	public Iterator<E> getPreOrderIterator(){
		return null;
	}
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the post-order approach.
	 */
	public Iterator<E> getPostOrderIterator(){
		return null;
	}

}
