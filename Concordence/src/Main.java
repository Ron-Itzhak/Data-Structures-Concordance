import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.tools.javac.util.List;

public class Main {

	public static void main(String[] args) {
		int row = 0;
		Word word;
		//linked list all letters
        LinkedList list = new LinkedList(); 
        for (int i=0;i<26;i++) {
        	list.insert(list, (char)(i+97));
        }
    	list.printList(list);
    	System.out.println();

		
		Word test = new Word("atest",0,0);
		Word test2 = new Word("abctest",0,0);
		Word test3 = new Word("abtest",0,0);

		list.wordInsert(list, test);
		list.wordInsert(list, test);
		list.wordInsert(list, test2);
		list.wordInsert(list, test3);

    	list.printList(list);

		
		
		
		
		
		
		
		try {
			File myObj = new File("Text.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String line = data.toLowerCase();
				String[] arr = line.split("[\\, \\-\\.\\'\\?\\,\\_\\@]+");
				//ArrayList<Word> wordsList = new ArrayList<Word>( );
				//wordsList.add(new Word(arr[0], row,0 ));
				for (int i = 0; i < arr.length; i++) {
					//System.out.print(arr[i]+" ");
					word=new Word(arr[i], row, i);
					//wordsList.add(word);
					//System.out.println(wordsList.get(i).toString()); print all words
					if(word.data.charAt(0)==list.head.data)
						list.head.tree.insert(word);
					
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
