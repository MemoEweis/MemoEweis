package Calculator;
import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		char operator;
		double num1,num2;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your first number");
		num1 = input.nextDouble();
		
		System.out.println("Enter the Operator (+,-,*,/)");
		operator = input.next().charAt(0);
		
		System.out.println("Enter your second number");
		num2 = input.nextDouble();
		
		input.close();
		
		switch ( operator ) {
		case '+':
			System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2) );
			break;
			
		case '-':
			System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2) );
			break;
		
		case '*':
			System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2) );
			break;
		
		case'/':
			if (num2 !=0)
			System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2) );
			else
				System.out.println(" Devide by Zero is invalid");
				
			 break;
			
			default:
				System.out.printf("%c is an invalid operator", operator);
				
			
		}
		
		
		
		
		
		
		
	}

}
