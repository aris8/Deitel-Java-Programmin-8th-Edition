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
		
		System.out.println("���� ��� ����� ������: ");
		number1 = input.nextInt();
		
		System.out.println("���� ��� ������� ������: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.println("��������: " + sum);
		
		mult = number1 * number2;
		System.out.println("��������: " + mult);
		
		sub = number1 - number2;
		System.out.println("�������: " + sub);
		
		module = number1 % number2;
		System.out.println("������: " + module);
		
		/*���� �� ������������ �� ������������ �� ��� ���������
		 ��������� �� �� ������������ ���������� 
		 ���� ��� ��������, ��. 
		 System.out.println( 5+6)
		 �� ���������� ����� ��� ������� �� ����� 11.
		 */
	}
}
