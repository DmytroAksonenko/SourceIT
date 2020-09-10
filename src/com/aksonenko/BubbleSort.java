package com.aksonenko;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[]bubbles = {1,3,5,2,6};
		System.out.println("Unsorted Bubbles: " + Arrays.toString(bubbles));
		sort(bubbles);
	}
	
	private static void sort(int[]bubbles) {
		boolean isSorted = false;
		int i;
		int j;
		while (!isSorted) {
			isSorted = true;
			for(i = 0 ; i < bubbles.length-1 ; i++) {
				if(bubbles[i] > bubbles[i+1]) {
					isSorted = false;
					j = bubbles[i];
					bubbles[i] = bubbles[i+1];
					bubbles[i+1] = j;
				}
			}
		}
		System.out.println("Sorted Bubbles: " + Arrays.toString(bubbles));
	}
	
}
