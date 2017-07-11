import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		System.out.println("Please enter a 5 digit number: ");
		number1 = input.nextInt();
		
		number5 = number1 % 10;
		number1 /= 10;
		
		number4 = number1 % 10;
		number1 /= 10;
		
		number3 = number1 % 10;
		number1 /= 10;
		
		number2 = number1 % 10;
		number1 /= 10;
		
		System.out.printf("%d   %d   %d   %d   %d", number1,number2,number3,number4,number5);
		
	}
}
