import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int count_minus = 0;
		int count_plus = 0;
		int count_zeros = 0;
		
		System.out.println("Please insert the first number: ");
		number1 = input.nextInt();
		
		System.out.println("Please insert the second number: ");
		number2 = input.nextInt();
		
		System.out.println("Please insert the third number: ");
		number3 = input.nextInt();
		
		System.out.println("Please insert the fourth number: ");
		number4 = input.nextInt();
		
		System.out.println("Please insert the fifth number: ");
		number5 = input.nextInt();
		
		//first number
		if(number1 < 0){
			count_minus++;
		}
		if(number1 > 0){
			count_plus++;
		}
		if(number1 == 0){
			count_zeros++;
		}
		
		//second number
		if(number2 < 0){
			count_minus++;
		}
		if(number2 > 0){
			count_plus++;
		}
		if(number2 == 0){
			count_zeros++;
		}
		
		//third number
		if(number3 < 0){
			count_minus++;
		}
		if(number3 > 0){
			count_plus++;
		}
		if(number3 == 0){
			count_zeros++;
		}
		
		//fourth number
		if(number4 < 0){
			count_minus++;
		}
		if(number4 > 0){
			count_plus++;
		}
		if(number4 == 0){
			count_zeros++;
		}
		
		//fifth number
		if(number5 < 0){
			count_minus++;
		}
		if(number5 > 0){
			count_plus++;
		}
		if(number5 == 0){
			count_zeros++;
		}
		
		System.out.printf("The number of zeros are: %d\nThe number of negative number are:%d\nThe number of positive number are:%d\n"
				,count_zeros
				,count_minus
				,count_plus);
	}
}
