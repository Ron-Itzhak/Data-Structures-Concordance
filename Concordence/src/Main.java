import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.tools.javac.util.List;

public class Main {

	public static void main(String[] args) {
		int row = 0;
		Word word;

		// array with all letters
		BinarySearchTree list[] = new BinarySearchTree[26];
		for (int i = 0; i < 26; i++) {
			list[i] = new BinarySearchTree((char) (i + 97));
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
			File myObj = new File("Text-long.txt");
			Scanner myReader = new Scanner(myObj);

			// Scanner myReader2 = new Scanner(System.in);
			System.out.println("aaa");

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String line = data.toLowerCase();
				String[] arr = line.split("[\\, \\-\\.\\'\\?\\,\\_\\@]+");
				// ArrayList<Word> wordsList = new ArrayList<Word>( );
				// wordsList.add(new Word(arr[0], row,0 ));
				for (int i = 0; i < arr.length; i++) {
					// System.out.print(arr[i]+" ");
					word = new Word(arr[i], row);
					// wordsList.add(word);
					// System.out.println(wordsList.get(i).toString()); print all words
//					if(word.data.charAt(0)==list.head.data)
//						list.head.tree.insert(word);
					// list.wordInsert(word);
					insertWordToList(list, word);

					// System.out.println(word);
				}
				row++;
				// System.out.println();

			}
			printAllWords(list);
			
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("a");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void insertWordToList(BinarySearchTree[] list, Word word) {
		int n = 0;
		while (list[n].getLetter() != word.data.charAt(0)) {
			n++;
		}
		if (list[n].getLetter() == word.data.charAt(0))
			list[n].insert(word);
	}

	public static void printAllWords(BinarySearchTree[] list) {
		for (int i = 0; i < 26; i++) {
			list[i].inOrderPrint(list[i].getRoot());
		}

	}

}
