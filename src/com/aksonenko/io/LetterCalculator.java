package com.aksonenko.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LetterCalculator {
	
	public static void fileCreation(String fileName, String text) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName + ".txt", "UTF-8");
			writer.println(text);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
	}
	public static void printTotalNumberOfLetters(String fileName) {
		int sumLine = 0;
		int sumReplaceLine = 0;
		int counter = 0;
		int trueCounter = 0;
        List<String> lines = null;
        String[] letters = {"q", "w", "e", "r", "t", "y", "u",
        		"i", "o", "p", "a", "s", "d", "f", "g", "h",
        		"j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        
        try {
        	lines = Files.readAllLines(Paths.get(fileName + ".txt"), StandardCharsets.UTF_8);
        } catch (Exception e) {
		}
    
        for (int i = 0; i < lines.size(); i++) {
        	for (int j = 0; j < letters.length ; j++) {       		 		
        		if (lines.get(i).contains(letters[j])) {
        			sumLine = lines.get(i).length();	
        			sumReplaceLine = lines.get(i).replaceAll(letters[j],"").length();	
        			counter = counter + sumLine - sumReplaceLine;
                }       		
        	}
        	if (counter > trueCounter) {
    			trueCounter = counter;
    		}
           
        }
        System.out.println("Total number of letters = " + trueCounter);
	}
	public static void printLettersByFrequencyOfUse(String fileName) {
		boolean isSorted = false;
		int sumLine = 0;
		int sumReplaceLine = 0;
		int counter = 0;
        List<String> lines = null;
        String[] letters = {"q", "w", "e", "r", "t", "y", "u",
        		"i", "o", "p", "a", "s", "d", "f", "g", "h",
        		"j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        int[] numberOfLetters = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
        		0,0,0,0,0,0};
        
        try {
        	lines = Files.readAllLines(Paths.get(fileName + ".txt"), StandardCharsets.UTF_8);
        } catch (Exception e) {
		}
    
        for (int i = 0; i < lines.size(); i++) {
        	for (int j = 0; j < letters.length ; j++) {       		 		
        		if (lines.get(i).contains(letters[j])) {
        			sumLine = lines.get(i).length();	
        			sumReplaceLine = lines.get(i).replaceAll(letters[j],"").length();	
        			counter = counter + sumLine - sumReplaceLine;
        			numberOfLetters[j] += counter;
                }   
//        		System.out.println(letters[j] + " is: " + counter);
        		counter = 0;
        	}        	
        }
        
//        System.out.println(Arrays.toString(numberOfLetters));       
        
		while (!isSorted) {
			isSorted = true;
			for(int i = 0 ; i < numberOfLetters.length-1 ; i++) {
				if(numberOfLetters[i] > numberOfLetters[i+1]) {
					isSorted = false;
					int j = numberOfLetters[i];
					String ch = letters[i];
					numberOfLetters[i] = numberOfLetters[i+1];
					letters[i] = letters[i+1];
					numberOfLetters[i+1] = j;
					letters[i+1] = ch;
				}
			}
		}
		
//		System.out.println("Sorted Bubbles: " + Arrays.toString(numberOfLetters));
//		System.out.println("Sorted Bubbles: " + Arrays.toString(letters));
		System.out.println("Sorted by frequency of use: ");
		
		for(int i = 0 ; i < numberOfLetters.length ; i++) {
			if(numberOfLetters[i] > 0) {
				System.out.println(letters[i] + " is " + numberOfLetters[i]);
			}
		}
	}
}


