
public class Word {
	String data;
	int place;
	int row;

	public Word(String data, int row, int place) {
		this.data = data;
		this.row=row;
		this.place=place;
	}

	@Override
	public String toString() {
		return  data +"("+ row +")";
	}

}
