
public class Node {
	String data;
	Node next;
	int place;
	int row;

	public Node(String data, int row, int place) {
		this.data = data;
		this.next = null;
		this.row=row;
		this.place=place;
	}

	@Override
	public String toString() {
		return  data +"("+ row + "," + place + ")";
	}

}
