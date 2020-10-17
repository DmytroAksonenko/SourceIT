package com.aksonenko.io;

public class LetterCalculatorDemo {
	public static void main(String[] args) {
		String fileName = "file";
		String text = "some text\n"
				+ "next some text\n"
				+ "the end";
		LetterCalculator letterCalculator = new LetterCalculator();
		letterCalculator.fileCreation(fileName, text);
		letterCalculator.printTotalNumberOfLetters(fileName);
		letterCalculator.printLettersByFrequencyOfUse(fileName);
	}
}
