package com.codesoft.task2;

import java.io.File;
import java.util.Scanner;

public class WordCountProject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for input text or Enter 2 for file  path : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter text: ");
			String userEnteredText = sc.nextLine();
			String[] Words = userEnteredText.split("[\\s\\p{Punct}]+");
			int wordCount = Words.length;
			System.out.println(wordCount);
			break;
		case 2:
			System.out.println("Enter filePath: ");
			String filePath = sc.nextLine();
			try {
				int fileWordCount = 0;
				File file = new File(filePath);
				Scanner fileInput = new Scanner(file);
				while (fileInput.hasNextLine()) {
					String line = fileInput.nextLine();
					String[] fileWords = line.split("[\\s\\p{Punct}]+");
					fileWordCount += fileWords.length;
				}
				System.out.println(fileWordCount);
				fileInput.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
		}
		sc.close();
	}
}
