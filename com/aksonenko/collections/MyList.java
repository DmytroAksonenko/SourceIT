package com.aksonenko.collections;

public interface MyList {

	void add(Object e); 
	String[] clear();
	void remove(Object o);
	Object[] toArray();
	int size();
	boolean contains(Object o);
	boolean containsAll(MyList c);
	
}
