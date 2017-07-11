import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args){
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
		
		Scanner input = new Scanner(System.in);
		/*In this example we use double variables because we cannot accurately 
		 * calculate the BMI value.You will learn about doubles in the next chapter.
		 */
		
		double weight;
		double height;
		
		System.out.println("Please enter your weight: ");
		weight = input.nextDouble();
		
		System.out.println("Please enter your heigth: ");
		height = input.nextDouble();
		
		System.out.printf("Your BMI Value is: %f", weight/(height * height));
		
	}
}
