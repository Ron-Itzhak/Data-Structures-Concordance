import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int row = 0;
		Word word;
		
		// array with BinarySearchTrees sorted by letters
		BinarySearchTree list[] = new BinarySearchTree[26];
		for (int i = 0; i < 26; i++) {
			list[i] = new BinarySearchTree((char) (i + 97));
		}


		try {
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String line = data.toLowerCase();
				String[] arr = line.split("[\\, \\-\\.\\'\\?\\,\\_\\@\\^\\>\\<\\: ]+");
				for (int i = 0; i < arr.length; i++) {
					word = new Word(arr[i], row);
					insertWordToList(list, word);
				}
				row++;
			}
						
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred, file is not found");
			e.printStackTrace();
		}

		
		//PrintWriter to Concordance file text
		try {
			PrintWriter printWriter = new PrintWriter("Concordance.txt");
			writeToFile(printWriter, list);
			printWriter.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred, file is not found");
			e.printStackTrace();
		}

	}
	//Insertion to the list
	public static void insertWordToList(BinarySearchTree[] list, Word word) {
		int n = 0;
		while (list[n].getLetter() != word.data.charAt(0)) {
			n++;
		}
		if (list[n].getLetter() == word.data.charAt(0))
			list[n].insert(word);
	}
	///console print
	public static void printAllWords(BinarySearchTree[] list) {
		for (int i = 0; i < 26; i++) {
			list[i].inOrderPrint(list[i].getRoot());
		}

	}
	//write to file
	public static void writeToFile(PrintWriter pw,BinarySearchTree[] list ) {
		for (int i = 0; i < 26; i++) {
		list[i].printinOrderString(list[i].getRoot(),pw);
		}

	}
	
	
	

}
