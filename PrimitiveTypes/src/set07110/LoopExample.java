/*
 * 
 * Code for SET07110 Foundations of Software Design and Development
 * Covers arrays and loops
 * 
 */

package set07110;

public class LoopExample {

	public static void main(String[] args) {

		/**
		 * A small array of int values can be declared like this
		 */
		int[] aSmallArray = new int[3];

		/**
		 * and assigned like this
		 */
		aSmallArray[0] = 5;
		aSmallArray[1] = 8;
		aSmallArray[2] = -3;

		/**
		 * or we can use this syntax to declare and assign values to an array at
		 * the same time
		 */

		int[] anotherSmallArray = { 55, 77, -22 };

		// arrays have a .length property which can be useful
		System.out.println(anotherSmallArray.length);// prints 3

		/**
		 * Loops are useful for examining many elements in an array You have
		 * seen a for loop in the lectures and tutorials
		 * 
		 * Let's remind ourselves......
		 * 
		 * Take an array of Strings
		 */

		String[] names = { "James", "Janice", "John" };

		/**
		 * We can loop over the elements of the array using an index Remember
		 * the index of an array starts at 0 *
		 * 
		 * the syntax below can be thought of as
		 * 
		 * for (do this once at start; continue until this is false; do this
		 * each time we loop)
		 * 
		 */

		for (int index = 0; index < 3; index++) {

			// get one of the elements of the names array (plural) and store it
			// in a variable called name (singular)
			// The singular plural convention is common when dealing with
			// "lists" or "arrays" and their single elements

			@SuppressWarnings("unused")
			String name = names[index];
			System.out.println(names[index]);
		}

		/**
		 * It is safer to use the .length property to check the array length
		 */

		for (int index = 0; index < anotherSmallArray.length; index++) {

			/**
			 * 
			 * get one of the elements of the names array (plural) and store it
			 * in a variable called name (singular)
			 * 
			 * The singular plural convention is common when dealing with
			 * "lists" or "arrays" and their single elements
			 */
			@SuppressWarnings("unused")
			String name = names[index];
			System.out.println(names[index]);

		}

		/**
		 * We can do this a simpler way if we do not need to know the index of
		 * the elements of an array (often we do need the index)
		 * 
		 * This is identical in function to the loop shown above
		 */

		for (String name : names) {
			System.out.println(name);
		}

		/**
		 * Use the knowledge gained so far to loop over the large data array of
		 * integers declared below and use appropriate logic and variables to
		 * determine and print the largest value in the array Check your result
		 * with your neighbour (in the JKCC!!!! DONT GO HOME and annoy the
		 * people in your street)
		 * 
		 */

		/**
		 * Here is a larger array for your week 3 lab
		 */
		int[] data = { 662310935, 295353266, 843648500, 1176814936, 1079941890, 562852836, 2146145033, 1103266545,
				2018954227, 747758874, 1495771666, 94954796, 1311635043, 600940768, 1238175896, 1757788983, 374211454,
				822617265, 4968409, 1959273632, 1659951240, 1263251747, 1740071485, 630923848, 614562282, 213594400,
				870086256, 65733751, 1787303133, 944051022, 1620150816, 888301577, 239385010, 1365186448, 494155349,
				1537512645, 860827835, 618017446, 709404520, 429272782, 714011609, 1911409136, 1003379361, 1977765170,
				2126837411, 804759888, 1286921073, 1960388512, 1980860208, 1652700460, 1275910728, 363244854,
				1660629378, 1532000914, 1841141524, 108164729, 1887448975, 1034411895, 399259992, 148874334, 260739053,
				70866200, 1480740836, 1198153349, 20438297, 640159362, 752505398, 554287749, 1130868580, 1452137772,
				1525456237, 114832994, 143733626, 343766466, 1761937126, 1416704027, 798379920, 302317309, 2075180661,
				642950240, 2093723945, 456617133, 1041619522, 50425441, 626503046, 2028554456, 1885439549, 252912322,
				503217832, 1840622845, 531591487, 1723129771, 1158743811, 1630162289, 341619135, 938331131, 1830544833,
				415602923, 778173485, 1221924764 };

		/**
		 * Add code below here
		 */
		int datum = 0;
		
		for (int i = 0; i < data.length; ++i) {
			if (datum < data[i]) {
				datum = data[i];
			}
		}
		System.out.println("Max value from array is " + datum);
		

	}// end of main block

}// end of class
