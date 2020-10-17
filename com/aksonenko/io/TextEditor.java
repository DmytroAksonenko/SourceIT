package com.aksonenko.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TextEditor {
	
	public static void main(String[] args) {
		String text = "";
		String message = "";
		System.out.println("Please write the file name: ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		System.out.println("Ok, now you can enter text: ");
		while (!message.equals("exit" + "\n")) {
			message = sc.nextLine() + "\n";
			if(!message.equals("exit" + "\n")) {
				text += message;
			}			
		}
		fileCreation(fileName, text);
		sc.close();
		readTheFile(fileName);
		printNumberOfChars(fileName);
		printNumberOfWords(fileName);
		printNumberOfLineWithMaxVowels(fileName);
	}
	
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
	
	public static void readTheFile(String fileName) {
		String path = "./" + fileName + ".txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
             list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("*********************\n" + "You created the file:\n" + path +
        		"\n\n" + fileName + ".txt contains:");
        list.forEach(System.out::println);
	}
	
	public static void printNumberOfChars(String fileName) {	
        int charCount = 0; 
        String line; 
        
		File file = new File("./" + fileName + ".txt"); 
        FileInputStream fileStream = null;       
		try {
			fileStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
				e1.printStackTrace();
		}
		InputStreamReader input = new InputStreamReader(fileStream); 
	    BufferedReader reader = new BufferedReader(input); 

        try {
			while((line = reader.readLine()) != null) { 		    
				charCount += line.length(); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
        
        System.out.println("Total number of characters = " + charCount); 
    } 
	public static void printNumberOfWords(String fileName) {	
        int wordCount = 0; 
        String line; 
        
		File file = new File("./" + fileName + ".txt"); 
        FileInputStream fileStream = null;       
		try {
			fileStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
				e1.printStackTrace();
		}
		InputStreamReader input = new InputStreamReader(fileStream); 
	    BufferedReader reader = new BufferedReader(input); 

        try {
			while((line = reader.readLine()) != null) { 		    
			    String[] wordList = line.split("\\s+");    
			    wordCount += wordList.length;;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}         

        System.out.println("Total number of words = " + (wordCount -1)); 
    }  
	public static void printNumberOfLineWithMaxVowels(String fileName) {
		int sumLine = 0;
		int sumReplaceLine = 0;
		int counter = 0;
		int trueCounter = 0;
		int line = 0;
		int trueLine = 0;
        List<String> lines = null;
        String[] vowels = {"e", "y", "u", "i", "o", "a"};
        
        try {
        	lines = Files.readAllLines(Paths.get(fileName + ".txt"), StandardCharsets.UTF_8);
        } catch (Exception e) {
		}
    
        for (int i = 0; i < lines.size(); i++) {
        	for (int j = 0; j < vowels.length ; j++) {       		 		
        		if (lines.get(i).contains(vowels[j])) {
        			sumLine = lines.get(i).length();	
        			sumReplaceLine = lines.get(i).replaceAll(vowels[j],"").length();	
        			counter = counter + sumLine - sumReplaceLine;
        			line = i + 1;
                }       		
        	}
        	if (counter > trueCounter) {
    			trueCounter = counter;
    			trueLine = line;
    		}
    		counter = 0;
           
        }
//        System.out.println(lines);
        System.out.println("Maximum number of vowels per line = " + trueCounter);
        System.out.println("Line number with the maximum number of vowels = " + trueLine);
	}

	
}


