/*
 * 
 * Code for SET07110 Foundations of Software Design and Development
 * Covers The Primitive Data Type boolean 
 * 
 */
package set07110;


public class PrimitiveTypeBoolean {

	
	public static void main(String[] args) {

		//lets play monopoly!!!!
		boolean passedGo = false;
		
		//check if the variable is true and if it is print "Collect �200"
		if(passedGo){
			System.out.println("Collect �200 " + passedGo);
		}
		
		/*
		 * nothing printed because the variable is false 
		 * 
		 * The code inside the if(){ ... } block never executed 
		 * 
		 * We can check for false using the unary operator ! placed before the variable to invert it
		 *  
		 */
		
		if(!passedGo){
			System.out.println("You have not passed GO DONOT Collect �200 " + passedGo);
		}
		
		/*
		 * The above code does not change the value of the variable.
		 * It only checks if the variable is NOT true (!true)
		 * 
		 */
		
		
		
		
		/* 
		 * We could have checked if passedGo EQUALS (==) false this way
		 * 
		 */
		
		if(passedGo == false){
			System.out.println("This is the same as the code above You have not passed GO DONOT Collect �200 " + passedGo);
		}
		
		 /*
		  * We can negate the value of the variable using the unary operator ! 
		 *  and assigning (=) the result back to the variable 
		 *  
		 */
		 		
		passedGo = !passedGo;
		
		//now the variable is true
		if(passedGo){
			System.out.println("Collect �200 " + passedGo);
		}
		
		
		//the following "if statement" is identical to the one above
		if(passedGo == true){
			System.out.println("Collect another �200");
		}
		
		
		
		/*
		 * We are going to use eclipse to write a method signature for us
		 * We still need to fill in the missing code though
		 * 
		 * It's not that good!!
		 * 
		 * The method should take the two int variables defined below as parameters and compare them 
		 * The method should return true if the a is greater than b
		 * In all other cases the method should return false
		 * 
		 * If you get stuck annoy your neighbour or one of the staff. But give it a try first !!!
		 * 
		 */
		
		int a = 5;
		int b = 4;
		
	
		/*
		 * *************************************************************
		 * 
		 *     Uncomment the line of code after this block comment
		 * 
		 * 
		 *     !!!!!! This will cause an error
		 *     !!!!!! Your programme is now broken
		 * 
		 *     Hover the mouse over the underlined error 
		 *       OR 
		 *     Click on the error symbol in the left margin
		 * 
		 *  
		 *     Click on the suggested fix then fill in the necessary code 
		 * 
		 * **************************************************************
		 * */
		 
				
		
		boolean answer = isTheFirstParameterGreaterThanTheSecondParameter(a, b);
		
		
		/*
		 * Write an if statement to check your result
		 * Try changing the values to a = 4; b = 5
		 * Does your method still work
		 * 
		 * What if you change them both to 8 
		 * int a = 8; 
		 * int b = 8;
		 * 
		 * Does the method behave as expected
		 * 
		 *  hint <    >    <=   >= 
		 */
		
		if (answer) {
			System.out.println("The first integer is larger!");
		} else {
			System.out.println("The first integer is not larger... :(");
		}
		
		/*
		 * 
		 * We can use booleans to store the result of equivalence checks 
		 * in the statement below the code 
		 * 
		 * (age==65) checks if age is equivalent to 65
		 * 
		 * to check for equivalence a double == is used 
		 * 
		 * 
		 * (age==65) checks if age equals 65 and returns either true or false
		 * 
		 *  
		 */
		
		int age = 21;
		boolean timeToCelebrate = (age == 21);
		
		if(timeToCelebrate){
			System.out.println("It's time to celebrate");
		}
		
		/*
		 * We can used the unary operator ! to check the opposite 
		 */
		

		if(!timeToCelebrate){
			System.out.println("It's NOT time to celebrate");
		}
		
	}

	private static boolean isTheFirstParameterGreaterThanTheSecondParameter(int a, int b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
}
