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
		
		System.out.println("Δώσε τον πρώτο αριθμό: ");
		number1 = input.nextInt();
		
		System.out.println("Δώσε τον δεύτερο αριθμό: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.println("’θροισμα: " + sum);
		
		mult = number1 * number2;
		System.out.println("Γινόμενο: " + mult);
		
		sub = number1 - number2;
		System.out.println("Διαφορά: " + sub);
		
		module = number1 % number2;
		System.out.println("Πηλίκο: " + module);
		
		/*Αντί να αποθηκεύεται τα αποτελέσματα σε μία μεταβλητή
		 μπορείται να τα υπολογίζεται κατευθείαν 
		 κατα την εκτύπωση, πχ. 
		 System.out.println( 5+6)
		 Το αποτέλεσμα αυτης της εντολής θα είναι 11.
		 */
	}
}
