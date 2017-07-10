import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		System.out.println("Please type in the first number: ");
		number1 = input.nextInt();
		
		System.out.println("Please type in the second number: ");
		number2 = input.nextInt();
		
		System.out.println("Please type in the third number: ");
		number3 = input.nextInt();
		
		System.out.println("Please type in the fourth number: ");
		number4 = input.nextInt();
		
		System.out.println("Please type in the fifth number: ");
		number5 = input.nextInt();
		
		int max = 0;
		int min = 0;
		int count = 0;
		
		if(number1 >= number2){
			count++;
		}
		if(number1 >= number3){
			count++;
		}
		if(number1 >= number4){
			count++;
		}
		if(number1 >= number5){
			count++;
		}
		if(count == 4){
			max = number1;
		}
		if(count == 0){
			min = number1;
		}
		count = 0;
		
		if(number2 > number1){
			count++;
		}
		if(number2 >= number3){
			count++;
		}
		if(number2 >= number4){
			count++;
		}
		if(number2 >= number5){
			count++;
		}
		if(count == 4){
			max = number2;
		}
		if(count == 0){
			min = number2;
		}
		count = 0;
		
		if(number3 > number1){
			count++;
		}
		if(number3 > number2){
			count++;
		}
		if(number3 >= number4){
			count++;
		}
		if(number3 >= number5){
			count++;
		}
		if(count == 4){
			max = number3;
		}if(count == 0){
			min = number3;
		}
		count = 0;
		
		if(number4 > number2){
			count++;
		}
		if(number4 > number3){
			count++;
		}
		if(number4 > number1){
			count++;
		}
		if(number4 >= number5){
			count++;
		}
		if(count == 4){
			max = number4;
		}
		if(count == 0){
			min = number4;
		}
		count = 0;
		
		if(number5 > number2){
			count++;
		}
		if(number5 > number3){
			count++;
		}
		if(number5 > number1){
			count++;
		}
		if(number5 > number4){
			count++;
		}
		if(count == 4){
			max = number5;
		}
		if(count == 0){
			min = number5;
		}
		count = 0;
		
		System.out.println("The max number is: " + max);
		System.out.println("The min number is: " + min);		
	}
}
