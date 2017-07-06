import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Please enter the first number: ");
		number1 = input.nextInt();
		
		System.out.println("Please enter the second number: ");
		number2 = input.nextInt();
		
		if(number1 > number2){
			System.out.println(number1 + " is larger.");
		}
		
		if(number2 > number1){
			System.out.println(number2 + " is larger.");
		}
		/*when checking for equality always
		 * usec double == because if you use one
		 * you will assing the number thus changing 
		 * the value of one
		 */
		if(number1 == number2){
			System.out.println("These numbers are equal");
		}
	}
}
