package com.marakana.examples;

/*
  In this example, ComplexExample has a main method when executed 
  instantiates a MsgGenerator object and then passes this object to a
  Thread.  The Thread's process is then started and then the main thread
  waits till the generator object notifies that it is done (via the 
  notifyAll()).  At this point the generator's printList method is called
  and information about what was in the generator's list is printed out.
*/
public class ComplexExample {

	public static void main(String[] args) {
		System.out.println("ComplexExample start");

		MsgGenerator generator = new MsgGenerator();
		
		Thread thread = new Thread(generator);
		thread.start();
		
		try {
			synchronized(generator) {
				generator.wait();
			}
		} catch (InterruptedException ie) {
			System.err.println("Generator Wait Interrupted!!!");
			ie.printStackTrace();
		} finally {
			System.out.println("Generator Wait End");
		}

		generator.printList();

		System.out.println("ComplexExample end");
	}
}
