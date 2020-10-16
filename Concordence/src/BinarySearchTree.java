
public class BinarySearchTree {
	
	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public BinarySearchTree() {
		this.root = null;
	}

	// Binary SearchTree Insert Methods Ron
	public void insertNode(Word data) {
		if (root == null)
			root = new TreeNode(data);
		else {
			if (this.root.data.data.compareTo(data.data) == 1) {
				if (root.left == null)
					this.root.left = new TreeNode(data);
				else
					this.root.left.left = new TreeNode(data);
			}
			if (this.root.data.data.compareTo(data.data) == 0 || this.root.data.data.compareTo(data.data) == -1)
				this.root.right = new TreeNode(data);
		}

	}

// Binary SearchTree Inorder Method
	public void inOrderPrint(TreeNode root) {
		if (root == null)
			return;
		inOrderPrint(root.left);
		System.out.println(root.data.toString());
		inOrderPrint(root.right);

	}

	// This method mainly calls insertRec()
	void insert(Word key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	TreeNode insertRec(TreeNode root, Word data) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new TreeNode(data);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (root.data.data.compareTo(data.data) == 1)
			root.left = insertRec(root.left, data);
		else if (root.data.data.compareTo(data.data) == -1 || root.data.data.compareTo(data.data) == 0)
			root.right = insertRec(root.right, data);

		/* return the (unchanged) node pointer */
		return root;
	}
	


	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		//tree.insert("b");
		//tree.insert("a");
		//tree.insert("c");
		//tree.insert("a");
		//tree.insert("a");
		System.out.println(tree.root);

		tree.inOrderPrint(tree.root);

	}

}
