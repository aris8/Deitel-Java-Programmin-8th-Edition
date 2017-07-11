import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int radius;
		System.out.println("Please enter the radius of the cycle: ");
		radius = input.nextInt();
		
		System.out.printf("%s%d\n", "The diameter of the cyrcle is: ",2*radius);
		System.out.printf("%s%f\n", "The perimeter of the cyrcle is: ", 2 * Math.PI * radius);
		System.out.printf("%s%f\n", "The area of the cyrcle is: ",Math.PI * radius * radius);
	}
}
