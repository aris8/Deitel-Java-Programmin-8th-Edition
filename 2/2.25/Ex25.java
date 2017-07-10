import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Please enter a number: ");
		number = input.nextInt();
		
		if(number%2 == 0 ){
			System.out.println("The number you entered is even!");
		}
		if(number % 2 == 1){
			System.out.println("The number you entered is odd!");
		}
	}
}
