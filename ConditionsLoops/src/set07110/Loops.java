/*
 * An example of the different Loop statements available in Java
 */
package set07110;

public class Loops {

	public static void main(String[] args) {
		
	
		int answer = 0;
		
		// A for loop where we require the index
		for(int i = 0; i < 3; i++){
			answer += i;
		}
		
		System.out.println(answer);
		
		
		
		
				
		// A while loop 		
		while(answer < 3){
			answer++;			
		}
		
		System.out.println(answer);
		
		
		
		
		
		// A do-while Loop
		do{
			answer++;
		}while(answer < 3);
		
		
		System.out.println(answer);
		
		
		
		

	}

}
