/*
 * The package our class resides in is declared first
 * 
 */
package set07110;

/*
 * To use built in Reference Types we have to import them 
 * java.util is the package that the class Random resides in
 * 
 * We import classes before the class declaration 
 * 
 */
import java.util.Random;

/*
 * Now we can use the imported Types in our class 
 */
public class RandomExample {

	public static void main(String[] args) {

		// create a new Random object and call it randomNumberGenerator
		Random randomNumberGenerator = new Random();

		// generate a random integer number between
		// 0 (inclusive) and the parameter provided (exclusive)
		// the possible values of value below are 0 and 1 
		@SuppressWarnings("unused")
		int value = randomNumberGenerator.nextInt(2);

		
		//what about a value between 1 and 100 
		// The possible values returned are 0..99
		value = randomNumberGenerator.nextInt(100);
		
		//but we can simply add 1
		value++;
		
	}
}
