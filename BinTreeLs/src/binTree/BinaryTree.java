package binTree;
/**
 * 
 * BinaryTree class allows a node to be inserted and the tree to be displayed in order via the treewalk method. 
 * It has a root node that acts like a pointer so it can always have access to the first node that is inserted
 * @author Leonel Sanchez
 * @version 1.0
 */
public class BinaryTree{
	Node rootNode;
	
		public boolean isEmpty()
		{//checks to see if tree is empty
			if(rootNode==null)
				return true;
			else 
				return false;
		}
		
		/**
		 * InsertNode creates a new node and inserts the value based on size. Smallest to the left, largest to the right
		 * @param newNode
		 */
		public void insertNode(Node newNode)
		{
			if(rootNode==null)
			{
				rootNode = newNode;
			}
			else
			{
				Node currentNode = rootNode;
				Node parentNode;
				
				while(true)
				{
					parentNode = currentNode;
					if(newNode.key < currentNode.key)
					{
						currentNode = currentNode.leftNode;
						
						if(currentNode == null)
						{
							parentNode.leftNode = newNode;
							return;
						}
					}
					else
					{
						currentNode = currentNode.rightNode;
					
						if(currentNode == null)
						{
							parentNode.rightNode = newNode;
							return;
						}
					}
				}
		
			}
		
		}
		/**
		 * treewalk inserts the root node of the object tree and calls the inOrder method
		 */
		public void treeWalk()
		{
			         this.inOrder(this.rootNode);
			
		}
		/**
		 * inOrder is a recursive method that displays the tree in order from left to right
		 * @param root
		 */
		private void inOrder(Node root)
		{//recursive method to print out the nodes in ascending order
			if(root!=null)
			{
				inOrder(root.leftNode);
				System.out.print(root.key);
				System.out.print(" ");
				inOrder(root.rightNode);
			}
			
		}
}


