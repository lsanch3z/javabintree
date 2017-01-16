package binTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// testcase 2
				System.out.println();
				System.out.println("testcase 1:");
				BinaryTree binTree2 = new BinaryTree();
				System.out.println(binTree2.isEmpty());
				binTree2.insertNode(new Node(3));
				binTree2.insertNode(new Node(1));
				binTree2.insertNode(new Node(60));
				binTree2.insertNode(new Node(30));
				binTree2.insertNode(new Node(45));			
				System.out.println(binTree2.isEmpty());
				binTree2.treeWalk();
	}

}
