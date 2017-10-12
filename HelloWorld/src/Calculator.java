import java.util.Scanner;

public class Calculator {
	public static void main (String[] argsb){
		
		Scanner num = new Scanner(System.in);
		
		double fnum, snum, result;
		String op;
				
		System.out.print("First Number: ");
			fnum = num.nextDouble();
		System.out.print("Second Number: ");
			snum = num.nextDouble();
		
		System.out.println("Options: ");
		System.out.println("	1) +");
		System.out.println("	2) -");
		System.out.println("	3) *");
		System.out.println("	4) /");
		System.out.print  ("Choose: ");
			op = num.next();
		
		//System.out.println(op);	
		switch (op) {
			case "1":
				result =  fnum + snum;
				break;
			case "2":
				result =  fnum - snum;
				break;
			case "3":
				result =  fnum * snum;
				break;
			case "4":
				result =  fnum / snum;
				break;
			default:
				result = 0;
				break;
		}

		
		System.out.print("Result is: " + result);
		num.close();
		
	}
}