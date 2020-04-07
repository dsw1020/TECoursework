package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "alices_adventures_in_wonderland.txt";

		File aliceFile = new File(fileName);

		Scanner fileScanner = new Scanner(aliceFile);

		Scanner theKeyboard = new Scanner(System.in);

		System.out.println("What is the file you are searching? ");
		String searchFile = theKeyboard.nextLine();

		if (searchFile.equals(fileName)) {
			System.out.println("What is the word you are searching? ");
			String searchWord = theKeyboard.nextLine();

			System.out.println("Should the search be case sensitive?(Y/N) ");
			String yesOrNo = theKeyboard.nextLine();

			if (yesOrNo.equals("Y")) {

				int lineNumber = 1;

				while (fileScanner.hasNextLine()) {
					String fileLine = fileScanner.nextLine();

					lineNumber++;

					if (fileLine.contains(searchWord)) {

						System.out.println(lineNumber + " )" + fileLine);
					}
				}
			} else {
				String caseInsensitiveSearchWord = " " + searchWord.toLowerCase();

				int lineNumber = 1;

				while (fileScanner.hasNextLine()) {
					String fileLine = fileScanner.nextLine();

					String caseInsesitiveFileLine = fileLine.toLowerCase();

					lineNumber++;

					if (caseInsesitiveFileLine.contains(caseInsensitiveSearchWord)) {

						System.out.println(lineNumber + ") " + fileLine);
					}
				}
			}
		} else {
			System.out.println("The following search is not vaild: " + searchFile);

		}
		fileScanner.close();
		theKeyboard.close();
	}

}

