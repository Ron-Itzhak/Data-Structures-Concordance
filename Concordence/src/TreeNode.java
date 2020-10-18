
public class TreeNode {
	Word data;
	TreeNode left;
	TreeNode right;
	public TreeNode(Word word) {
		this.data = word;
		this.left = null;
		this.right = null;
	}
	public Word getData() {
		return data;
	}
	public void setData(Word word) {
		this.data = word;
	}
	@Override
	public String toString() {
		return data.toString();
	}
}
