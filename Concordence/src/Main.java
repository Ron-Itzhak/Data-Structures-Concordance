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
//    	list.printList();
//    	System.out.println();
//
//		
//		Word test = new Word("atest",0,0);
//		Word test1 = new Word("atest",0,1);
//		///not entered+not printed yet
//		Word test2 = new Word("abctest",0,2);
//		Word test3 = new Word("abtest",0,3);
//
//		list.wordInsert(test);
//		list.wordInsert(test1);
//		list.wordInsert(test2);
//		list.wordInsert(test3);
//
//
//		
		
		
		
		
		
		
		try {
			File myObj = new File("Text.txt");
			Scanner myReader = new Scanner(myObj);
			
			Scanner myReader2 = new Scanner(System.in);
System.out.println("aaa");
			
			
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
//					if(word.data.charAt(0)==list.head.data)
//						list.head.tree.insert(word);
					list.wordInsert(word);
					System.out.println(word);
				}
				row++;
				//System.out.println();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		

    	list.printList();

	
		

	}
}
