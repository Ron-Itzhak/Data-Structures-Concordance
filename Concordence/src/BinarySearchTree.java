import java.io.PrintWriter;

public class BinarySearchTree {
	private char letter;
	private TreeNode root;

	public char getLetter() {
		return letter;
	}

	public TreeNode getRoot() {
		return root;
	}

	public BinarySearchTree(char letter) {
		this.root = null;
		this.letter = letter;
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
	// Binary SearchTree Inorder Method write to file

	public void printinOrderString(TreeNode root, PrintWriter pw) {
		if (root == null)
			return;
		printinOrderString(root.left,pw);
		pw.println(root.data.toString());
		printinOrderString(root.right,pw);	
	}
	
	
	
	
	
	

	// This method mainly calls insertRec()
	void insert(Word word) {
		root = insertRec(root, word);
	}

	TreeNode insertRec(TreeNode root, Word word) {

		if (root == null) {
			root = new TreeNode(word);
			return root;
		}

		if (root.data.data.compareTo(word.data) >= 1)
			root.left = insertRec(root.left, word);
		else if (root.data.data.compareTo(word.data) <= 0)
			root.right = insertRec(root.right, word);

		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree('a');
		Word test = new Word("b", 0);
		Word test1 = new Word("a", 1);
		tree.insert(test);
		tree.insert(test1);
		/// not entered+not printed yet
		Word test2 = new Word("c", 2);
		Word test3 = new Word("d", 3);
		tree.insert(test2);
		tree.insert(test3);

		// System.out.println(tree.root);
		//tree.inOrderPrint(tree.root);
		//System.out.println();
		StringBuffer b=new StringBuffer();
		//b=(tree.inOrderString(tree.root,b));
		System.out.println(b);

	}

}
