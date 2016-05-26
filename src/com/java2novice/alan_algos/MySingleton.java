/*
 * Singleton class means you can create only one object for 
 * the given class. You can create a singleton class by making 
 * its constructor as private, so that you can restrict the 
 * creation of the object. Provide a static method to get instance 
 * of the object, wherein you can handle the object creation inside 
 * the class only. In this example we are creating object by using 
 * static block 
 */
package com.java2novice.alan_algos;

public class MySingleton {
	private static MySingleton obj;
	//private MySingleton(){		
	//}
	static {
		obj = new MySingleton();
	}
	public static MySingleton getInstance() {
		return obj;
	}
	public void printme()	{
		System.out.println("test me");
	}
	public static void main(String[] args) {
		
		MySingleton ms1 = getInstance();
		MySingleton ms2 = getInstance();
		ms1.printme();
		ms2.printme();
	}

}
