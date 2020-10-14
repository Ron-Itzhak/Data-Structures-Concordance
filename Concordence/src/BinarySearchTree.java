
public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	// Binary SearchTree Insert Methods
	public void insertNode(String data) {
		if (root == null)
			root = new TreeNode(data);
		else {
			if (this.root.data.compareTo(data) == 1) {
				if (root.left==null)
					this.root.left = new TreeNode(data);
				else 
					this.root.left.left=new TreeNode(data);
			}
			if (this.root.data.compareTo(data) == 0 || this.root.data.compareTo(data) == -1)
				this.root.right = new TreeNode(data);
		}

	}

// Binary SearchTree Inorder Method
	public void inOrderPrint(TreeNode root) {
		if (root == null)
			return;
		inOrderPrint(root.left);
		System.out.println(root.data);
		inOrderPrint(root.right);

	}
	
	
	
	
    // This method mainly calls insertRec() 
    void insert(String key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    TreeNode insertRec(TreeNode root, String data) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new TreeNode(data); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (root.data.compareTo(data) == 1) 
            root.left = insertRec(root.left, data); 
        else if (root.data.compareTo(data) == -1||root.data.compareTo(data) == 0) 
            root.right = insertRec(root.right, data); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 


	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert("b");
		tree.insert("a");
		tree.insert("c");
		tree.insert("a");
		tree.insert("a");
		System.out.println(tree.root);


		tree.inOrderPrint(tree.root);

	}

}
