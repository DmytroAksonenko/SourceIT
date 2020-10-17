package com.aksonenko.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class DefaultMyList implements MyList{
	
	private static final int DEFAULT_CAPACITY = 10;
	private int value = 0;
	static Object[]array = new Object[DEFAULT_CAPACITY];
	private String[]stringArray = new String[DEFAULT_CAPACITY];
	private String[]stringArrayClear;
	private int lengthIndex;
	private String result ="";
	
	@Override
	public String toString() {
		return Arrays.deepToString(array);
	}
	
	@Override
	public void add(Object e) {
		if(e == null)
			return;
		if(array == null)
			array = new Object[DEFAULT_CAPACITY];
		if(array.length < lengthIndex + 1)
			array = Arrays.copyOf(array, array.length * 2);
		array[lengthIndex++] = e;
	}

	@Override
	public String[] clear() {
		if (stringArray == null) {
		}
		for (Object ob: stringArray) {
				ob = null;
		}
		return stringArray;
	}

	@Override
	public void remove(Object o) {
		if(o == null)
			return;
		if(array == null)
			array = new Object[DEFAULT_CAPACITY];
		if(array.length < lengthIndex + 1)
			array = Arrays.copyOf(array, array.length * 2);
		for (int i = 0 ; i < lengthIndex + 1 ; i++) {
			if (array[i] == o) {
				array[i] = null;
				i = array.length;
			}
		}
	}

	@Override
	public Object[] toArray() {
		String[] stringArray = Arrays.copyOf(array, array.length, String[].class);
		return stringArray;
	}

	@Override
	public int size() {	
		int counter = 0;
		if (array != null) {
			for (int i = 0; i < lengthIndex + 1 ; i++) {
				if (array[i] != null) {
					counter++;
				}
			}
		}	
		return counter;
	}

	@Override
	public boolean contains(Object o) {
		if (array != null) {
			for (int i = 0; i < lengthIndex + 1 ; i++) {
				if (array[i] == o) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		return false;
	}

}
