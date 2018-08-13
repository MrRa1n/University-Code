package set07110;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input your mark: ");
		String input = scanner.nextLine();
		double mark = Double.parseDouble(input);
		
		System.out.print("Please enter total: ");
		input = scanner.nextLine();
		double totalMark = Double.parseDouble(input);

		double percentage = (mark / totalMark) * 100;

		if (percentage >= 40) {
			System.out.println("You have passed.");
		} else {
			System.out.println("You have failed.");
		}
		
		scanner.close();
		
	}

}
