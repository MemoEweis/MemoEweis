import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println (" Enter your Month Number");
		int monthNumber = keyboardScanner.nextInt();
		if (monthNumber >= 1 && monthNumber <= 3) {
			System.out.println ("You're in Quarter 1");
			
		}else if (monthNumber >= 4 && monthNumber <= 6) {
			System.out.println ("You're in Quarter 2");
			
		}else {
		System.out.println ("You're not in the first half of the year");
		
	}}

}
