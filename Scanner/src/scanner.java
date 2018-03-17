import java.util.Scanner;


public class scanner {
	
	public static void main(String[] args) {
	
		
		/*
	 	Scanner kb = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = kb.nextLine();
		System.out.print("Enter your age: ");
		int number = kb.nextInt();
		System.out.print("Enter your gpa: ");
		double doub = kb.nextDouble();
		System.out.print("Enter your gender: ");
		char gender = kb.next().charAt(0);
		
		
		System.out.println("Greetings " + name);
		System.out.println("Your age " + number);
		System.out.println("Your gpa " + doub);
		System.out.println("Your gender  " + gender);
		*/
		
		//avg calculator using scanners
		Scanner kb = new Scanner(System.in);
		int sum =0;
		int totalNum =0;
		System.out.println("Welcome to the AVG Calc. Please enter numbers!");
		while(kb.hasNextInt()) {
			totalNum++;
			int number = kb.nextInt();
			sum+=number;
			
			
			
		}
		System.out.println("The average is " + ((double)sum/totalNum));
		
		

	}
}
