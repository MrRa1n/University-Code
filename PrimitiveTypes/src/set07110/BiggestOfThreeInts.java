package set07110;

public class BiggestOfThreeInts {

	public static void main(String[] args) {
		int[] value = new int[3];
		
		for (int i = 0; i < value.length; ++i) {
			value[i] = Integer.parseInt(args[i]);
		}
		
		if (value[0] > value[1] && value[0] > value[2]) {
			System.out.println("The largest number is " + value[0]);
		} else if (value[1] > value[0] && value[1] > value[2]) {
			System.out.println("The largest number is " + value[1]);
		} else {
			System.out.println("The largest number is " + value[2]);
		}
	}

}
