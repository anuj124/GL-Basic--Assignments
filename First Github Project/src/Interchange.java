import java.util.Scanner;
public class Interchange {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter First Number");
		num1= sc.nextInt();
		System.out.println("Enter Second Number");
		num2= sc.nextInt();
		/*
		 * Further is the process of 
		 * interchanging values of two variable 
		 * without using third variable
		 */
		num1=num1+num2; //Interchanging values
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("first number after Interchanging " +num1);
		System.out.println("Second Number after Interchanging " +num2);
		sc.close();
	}

}
