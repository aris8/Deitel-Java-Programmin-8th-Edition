import java.util.Scanner;

public class Ex15 {
	public static void main (String[] args){
		//Scanner Object
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int mult;
		int sub;
		int module;
		
		System.out.println("Input the first number ");
		number1 = input.nextInt();
		
		System.out.println("Input the second number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.println("Sum: " + sum);
		
		mult = number1 * number2;
		System.out.println("Product: " + mult);
		
		sub = number1 - number2;
		System.out.println("Difference: " + sub);
		
		module = number1 % number2;
		System.out.println("Quotient: " + module);
		
		/*Instead of saving the result on a variable
		 you can dynamically calculate it inside the print function, 
		 System.out.println( 5+6)
		 ,the result of this line is 11.
		 */
	}
}
