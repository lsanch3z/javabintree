package binTree;
/**
 * class node that has left and right nodes that point to another node and takes an integer value
 * Outside the BinaryTree class allowing a Node object to be declared outside of the BinaryTree class
 * @author Leonel Sanchez
 * @version 1.0
 */

public class Node {
	public Node leftNode;
	public Node rightNode;
	public int key;
	
	/**
	 * Node takes a key and sets left and right pointers to null
	 * @param key integer value
	 */
	public Node(int key)
	{//constructor
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	
}