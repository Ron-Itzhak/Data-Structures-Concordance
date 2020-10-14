import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int row = 0;
		
		//linked lis all letters
        LinkedList list = new LinkedList(); 
        for (int i=0;i<26;i++) {
        	list.insert(list, (char)(i+97));
        }
    	list.printList(list);
    	System.out.println();

		
		
		
		
		
		
		
		
		
		
		try {
			File myObj = new File("Text.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String line = data.toLowerCase();
				String[] arr = line.split("[\\, \\-\\.\\'\\?\\,\\_\\@]+");
				ArrayList<Word> wordsList = new ArrayList<Word>( );
				wordsList.add(new Word(arr[0], row,0 ));
				for (int i = 1; i < arr.length; i++) {
					//System.out.print(arr[i]+" ");
					wordsList.add(new Word(arr[i], row, i));
					//System.out.println(wordsList.get(i).toString()); print all words
					
				}
				row++;
				//System.out.println();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		BinarySearchTree tree = new BinarySearchTree();
		

		
	
		

	}
}
