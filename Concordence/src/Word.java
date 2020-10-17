
public class Word {
	String data;
	int row;

	public Word(String data, int row) {
		this.data = data;
		this.row=row;
	}

	@Override
	public String toString() {
		return  data +"("+ row +")";
	}

}
