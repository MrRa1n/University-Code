/*
 * 
 * It is good practice to add block comments at the start to describe a class  
 * 
 * Frequently copyright information appears here also
 * 
 * Example Code for SET07110 Foundations of Software Design and Development
 * Covers The Primitive Data Type int
 * Information on the primitive data types can be found at 
 * 
 * 	  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * 
 * You should familiarise yourself with these essential building blocks and get practice using them 
 * 
 * 
 * Note that the package where the class is created needs added 
 * at the start of the code, before the class is declared
 */
package set07110;

/**
 * This is another type of comment called javadoc that is used to document
 * elements of your code
 * 
 * These should be used to describe classes and methods and should be placed
 * directly above the block you are describing
 * 
 * Hover the mouse over the class name below to see what Javadoc comments are
 * useful for
 * 
 * @author Kevin Sim
 * 
 * @see <a href = "https://www.google.co.uk/search?q=javadoc">CLICK ME</a>
 *
 * 
 */
public class PrimitiveTypeInt {// <--Hover over the class name

	/**
	 * This is our main method: The entry point of the application. It is NOT
	 * usually necessary to add Javadoc comments to document the "main" method
	 */
	public static void main(String[] args) {

		// The third type of comment is a single line comment like this

		// lets create some integers -- one int at a time
		int a = 1;
		int b = 2;

		// Notice the use of + in the print statement below to concatenate
		// strings (combine)
		System.out.println("The variable we named a now holds the value " + a);

		// two ints at once
		int c = 3, d = 4;

		// declare an int without assigning a value 
		int e;
		// assign value here
		e = 4;
		// reuse it here
		e = 5;

		
		// usually we prefer descriptive names for variables
		int answer;

		// print the sum of a,b,c,d and e
		answer = a + b + c + d + e;
		System.out.println("The sum of a + b + c + d + e is " + answer);

		/*
		 * ADD code below this comment so that the next println statement prints
		 * the product of a,b,c,d and e (multiply the values together)
		 * 
		 */
		
		answer = a * b * c * d * e;
		System.out.println("The product of a * b * c * d * e is " + answer + " the answer should be 120");

		/*
		 * ADD code below this comment so that the next println statement prints
		 * the answer to 9 divided by 2
		 * 
		 */
		
		answer = 9 / 2;
		System.out.println("integer division of 9 by 2 gives the answer " + answer + " the answer should be 4");

		/*
		 * ADD code below this comment so that the next print statement prints
		 * the remainder of the integer division of 9/2
		 * 
		 */

		answer = 9 % 2;
		System.out.println("The remainder of 9 / 2 is " + answer + " the answer should be 1 (hint %)");

		/*
		 * Each of the primitive types has a corresponding reference type
		 * (object) that provides useful functionality for example we can set
		 * our integer to the maximum value allowed for an int using
		 * Integer.MAX_VALUE;
		 * 
		 */

		answer = Integer.MAX_VALUE;
		System.out.println("The largest Ivalue of int is " + answer);

		// what happens if we add 1?
		// try it and see

		answer++;
		System.out.println("The value of Integer.MAX_VALUE + 1 is " + answer + " It should read -2147483648");

		/*
		 * This answer is negative due to the "twos complement" representation
		 * Java uses for byte, int and long 
		 * 
		 * It is important that you know the limitations of the data type you
		 * are using and that you use the correct data type for the data you are
		 * going to process page
		 * 
		 * 
		 * 
		 */
		
		

		/*
		 * The next line of code calls another method defined at the end of this class 
		 * See if you can fill in the missing code in the method
		 * 		
		 */
		
		answer = addTwoIntegers(a, b);
		System.out.println(answer);
		
	}//main method ends here

	
	/**
	 * A method that takes two integers as input and returns the sum of their values
	 * Note that the method does not return "void" like our "main method" but returns an int
	 * 
	 * @param a
	 * @param b
	 * 
	 * @return the sum of the parameters 
	 */
	private static int addTwoIntegers(int a, int b) {
		//add some code here
		
		return a + b;
	}
}
