import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		number = 88;
		
		System.out.println("A number is: " + number);
		
		System.out.print("What is the number? ");
		Scanner number2 = new Scanner(System.in);
		
		System.out.print("The number is: " + number2.nextLine());
		number2.close();
	}

}
