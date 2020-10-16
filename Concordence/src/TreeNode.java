
public class TreeNode {
	Word data;
	TreeNode left;
	TreeNode right;
	public TreeNode(Word data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Word getData() {
		return data;
	}
	public void setData(Word data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data.toString();
	}
}
