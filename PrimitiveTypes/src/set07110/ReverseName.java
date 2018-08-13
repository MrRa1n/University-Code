package set07110;

public class ReverseName {

	public static void main(String[] args) {
		
		if (args[0] == null) {
			System.exit(0);
		}
		
		String name = args[0];
		String[] nameChars = name.split("");
		
		int lastIndex = name.length() - 1;
		
		System.out.print("The name you entered is ");
		
		for (int i = lastIndex; i >= 0; --i) {
			System.out.print(nameChars[i]);
		}
		
	}

}
