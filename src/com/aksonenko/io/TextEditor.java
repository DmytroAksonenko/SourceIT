package com.aksonenko.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


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
				text = text + message;
			}			
		}
		fileCreation(fileName, text);
		sc.close();
		readTheFile(fileName);
		returnNumbers(fileName);
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
		String path = "D:/Eclipse/WS/SourceIT/" + fileName + ".txt";
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
	
	public static void returnNumbers(String fileName) {	
        int charCount = 0; 
        int wordCount = 0; 
        int vowelCount = 0;
        String line; 
        
		File file = new File("D:/Eclipse/WS/SourceIT/" + fileName + ".txt"); 
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
			    String[] wordList = line.split("\\s+");    
			    wordCount += wordList.length;;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
        
        System.out.println("Total number of characters = " + charCount); 
        System.out.println("Total number of words = " + (wordCount -1)); 
        //System.out.println("Total number of vowels = " + vowelCount);
    } 
	
}


