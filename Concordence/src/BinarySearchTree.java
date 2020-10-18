import java.io.PrintWriter;

public class BinarySearchTree {
	private char letter;
	private TreeNode root;

	public BinarySearchTree(char letter) {
		this.root = null;
		this.letter = letter;
	}

	public char getLetter() {
		return letter;
	}

	public TreeNode getRoot() {
		return root;
	}

	// Binary SearchTree Insert Methods
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

// Binary SearchTree Inorder print method
	public void inOrderPrint(TreeNode root) {
		if (root == null)
			return;
		inOrderPrint(root.left);
		System.out.println(root.data.toString());
		inOrderPrint(root.right);

	}
	// Binary SearchTree Inorder method write to file

	public void writeInOrder(TreeNode root, PrintWriter pw) {
		if (root == null)
			return;
		writeInOrder(root.left, pw);
		pw.println(root.data.toString());
		writeInOrder(root.right, pw);
	}

	public void insert(Word word) {
		root = insertRec(root, word);
	}

	private TreeNode insertRec(TreeNode root, Word word) {
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

}
