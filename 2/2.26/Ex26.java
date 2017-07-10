import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Input the first number ");
		number1 = input.nextInt();
		
		System.out.println("Input the second number: ");
		number2 = input.nextInt();
		
		if(number1 % number2 == 0){
			System.out.println(number1 + " is multiple of " + number2);
		}
		
	}
}
