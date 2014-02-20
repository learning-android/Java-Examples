package com.marakana.examples;

/*
   A simple example class with a basic main method
   that instantiates several objects of the class, 
   manipulates the objects, and outputs information
   about the object
*/
public class SimpleExample {
	
	private int number;	

	public SimpleExample() { }

	public void setValue(int val) {
		number = val;
	}

	public int getNumber() {
		return number;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			SimpleExample example = new SimpleExample();

			if(i/2 <= 2) {
				example.setValue(i);
			} else {
				example.setValue(i*10);
			}

			System.out.println("SimpleExample #"+i+"'s value is "+example.getNumber());
		}
	}
}
