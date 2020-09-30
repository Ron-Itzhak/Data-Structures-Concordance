import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int row = 0;
		try {
			File myObj = new File("Text.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String line = data.toLowerCase();
				String[] arr = line.split("[\\, \\-\\.\\'\\?\\,\\_\\@]+");
				ArrayList<Node> nodeList = new ArrayList<Node>( );
				nodeList.add(new Node(arr[0], row,0 ));
				for (int i = 1; i < arr.length; i++) {
					//System.out.print(arr[i]+" ");
					nodeList.add(new Node(arr[i], row, i));
					System.out.println(nodeList.get(i).toString());
				}
				row++;
				//System.out.println();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
///////// Not in use
//	if(b.contains(","))
//		b= b.substring(0, b.length()-1);

//	System.out.println(b);
		// Scanner s = new Scanner (System.in);
		// String b=s.next();
		//String[] arr = data.split("\\W");
		
		
		
	
		

	}
}
