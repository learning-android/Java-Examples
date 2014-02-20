package com.marakana.examples;

/*
   A simple example class with a basic main method
   that instantiates several objects of the class, 
   manipulates the objects, and outputs information
   about the object
*/
public class SimpleExampleWErrorHandling {
	
	private int number;
	
	public SimpleExampleWErrorHandling() { }

	//------- ERROR HANDLING PART 1
	public void setValue(int val) throws Exception {
		if(val < 0) throw new Exception("setValue Exception- Value that is set is Negative!");
		number = val;
	}
	
	public int getNumber() {
		return number;
	}

	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			SimpleExample example = new SimpleExample();

			if(i/2 <= 2) {
				try { example.setValue(i); } catch (Exception e) { e.printStackTrace(); }   //------- ERROR HANDLING PART 4
			} else {
				try { example.setValue(i*10); } catch (Exception e) { e.printStackTrace(); }  //------- ERROR HANDLING PART 4
			}

			System.out.println("SimpleExample #"+i+"'s value is "+example.getNumber());
		}


		showErrorHandling(); //------- ERROR HANDLING PART 2
		
	}

	//------- ERROR HANDLING PART 3
	public static void showErrorHandling() {
		// here we show Error Handling
		try {
			System.out.println();
			System.out.println("SimpleExample BadValue Insert Case Start");
			SimpleExample example = new SimpleExample();
			example.setValue(-10);
			System.out.println("SimpleExample BadValue's value is "+example.getNumber());
			System.out.println("SimpleExample BadValue Insert Case End");

		} catch (Exception e) {

			System.err.println("SimpleExample BadValue Insert Case threw an exception");
			e.printStackTrace();

		} finally {

			System.out.println("SimpleExample BadValue Insert Case Finally Called");

		}
	}
}
