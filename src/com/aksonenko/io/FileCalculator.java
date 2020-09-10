package com.aksonenko.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileCalculator {
		
	public static void main(String[] args) {
        countFiles();
        nameFiles();
        filesFind();
        filesWalk();
        
    }

	private static void countFiles() {
	    long count = 0;
	    
	    try {
	    	String fileName = "";
	        Stream<Path> files = Files.list(Paths.get("D:/Eclipse/WS/SourceIT/src/com/aksonenko"));
	        Iterable<Path> iterable = files::iterator;
	        
	        for (Path path: iterable) {
	            fileName = path.getFileName().toString();
	            if(fileName.endsWith(".java"))
	            	count++;
	        }

	        System.out.println("Number of files in src/com/aksonenko: " + count + "\n********************");

	        files.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    
	private static void nameFiles() {
		
	    try {
	    	String fileName = "";
	    	String allNames = "File names in src/com/aksonenko:\n";
	        Stream<Path> files = Files.list(Paths.get("D:/Eclipse/WS/SourceIT/src/com/aksonenko"));
	        Iterable<Path> iterable = files::iterator;
	        
	        for (Path path: iterable) {
	            fileName = path.getFileName().toString();
	            if(fileName.endsWith(".java"))
	            	
	            	allNames = (allNames + "\n" + fileName);
	        }

	        System.out.println(allNames + "\n********************");

	        files.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	private static void filesFind() {
		Path srcPath = Paths.get("D:/Eclipse/WS/SourceIT/src");
        Stream<Path> stream = null;
		try {
			stream = Files.find(srcPath, 100,
			        (path, basicFileAttributes) -> {
			            File file = path.toFile();
			            return !file.isDirectory() &&
			                    file.getName().contains(".java");
			        });
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Files.find\n");
        stream.forEach(System.out::println);
	}
	private static void filesWalk() {
		var dirName = "D:/Eclipse/WS/SourceIT/src/com/";
		System.out.println("********************\nFiles.walk\n");

        try (Stream<Path> stream = Files.walk(Paths.get(dirName), 10)) {
        	stream.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println();
	}
    
}


