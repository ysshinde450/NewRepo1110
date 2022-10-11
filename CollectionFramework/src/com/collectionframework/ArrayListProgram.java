package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("I");
		al.add("Love");
		al.add("My");
		al.add("India");
		System.out.println("Below is the Arraylist object contains");
		System.out.println(al);
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());	
		}
	}
}