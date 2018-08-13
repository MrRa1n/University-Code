package set07110;

public class PrimitiveTypeDouble {

	public static void main(String[] args) {
		/*
		 * A second hand computing book describing
		 * floating point numbers costs £1.60
		 * but the section on precision is missing
		 * 
		 */
		double originalCost = 1.60;
		
		// you negotiate a deduction of 75 pence
		double deduction = 0.75;
		
		// the final cost is calculated as
		double finalCost = originalCost - deduction;
		
		// What is the final cost?
		System.out.println(finalCost);
	}

}
