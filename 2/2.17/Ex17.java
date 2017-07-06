import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Please enter the first number: ");
		number1 = input.nextInt();
		
		System.out.println("Please enter the second number: ");
		number2 = input.nextInt();
		
		System.out.println("Please enter the third number: ");
		number3 = input.nextInt();
		
		int sum = number1 + number2 + number3;
		System.out.println("Sum: " + sum);
		
		int prod = number1 * number2 * number3;
		System.out.println("Product: " + prod);
		
		int avr = sum / 3;
		System.out.println("Average: " + avr);
		
		if(number1 >= number2 ){
			if(number1 >= number3){
				System.out.println(number1 + " is the larger");
				if(number3 <= number2){
					System.out.println(number3 + " is the smallest.");
				}
				if(number2 < number3){
					System.out.println(number2 + " is the smallest.");
				}
			}
		}
		
		if(number2 > number1 ){
			if(number2 > number3){
				System.out.println(number2 + " is the larger");
				if(number1 <= number3){
					System.out.println(number1 + " is the smallest.");
				}
				if(number3 < number1){
					System.out.println(number3 + " is the smallest.");
				}
			}
		}
		
		if(number3 > number2 ){
			if(number3 > number1){
				System.out.println(number3 + " is the larger");
				if(number1 <= number2){
					System.out.println(number1 + " is the smallest.");
				}
				if(number2 < number1){
					System.out.println(number2 + " is the smallest.");
				}
			}
		}
		
	}
}
