package set07110;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        input = Integer.parseInt(scanner.nextLine());

        while (input != 1) {
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input = (input * 3) + 1;
            }
            System.out.println(input);
        }


    }
}
