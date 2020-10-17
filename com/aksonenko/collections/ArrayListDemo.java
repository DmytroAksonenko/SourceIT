package com.aksonenko.collections;

import java.util.ArrayList;
import java.util.Arrays;

import com.aksonenko.collections.DefaultMyList;

public class ArrayListDemo {
	public static void main(String[] args) {
		String a = "SpaceX";
		String b = "Boeing";
		String[]array = {"nasa", "g1", "E", "231*65", "8x"};
		
		DefaultMyList myList = new DefaultMyList();

		//My method Add();
		myList.add(a);
		for (int i = 0 ; i < 5 ; i++) {
			myList.add(array[i]);
		}
		myList.add(b);
		
		//My method toArray();
		String[]stringArray = (String[]) myList.toArray();
		System.out.println(Arrays.toString(stringArray));
		
		//My method remove();
		myList.remove(b);
		String[]removedStringArarray = (String[]) myList.toArray();
		System.out.println(Arrays.toString(removedStringArarray));
		
		//My method size();
		System.out.println("Number of elements: " + myList.size());
		
		//My method contains();
		//true
		System.out.println("[" + a + "]" + " is the array contained? " + myList.contains(a));
		//false
		System.out.println("[" + b + "]" + " is the array contained? " + myList.contains(b));
		
		//My method containsAll();
		//TestList for method containsAll();
				ArrayList <String>testArrayList = new ArrayList<String>();
				testArrayList.add("SpaceX");
				testArrayList.add("g1");
				testArrayList.add("231*65");
//		System.out.println(testArrayList + " is the array contained? " + myList.containsAll(testArrayList));
		
		//My method clear();
		String[]stringArrayClear = (String[]) myList.clear();
		System.out.println(Arrays.toString(stringArrayClear));
	}
	
}
