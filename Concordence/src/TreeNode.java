
public class TreeNode {
	String data;
	TreeNode left;
	TreeNode right;
	public TreeNode(String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
}
