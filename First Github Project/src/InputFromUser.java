import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter any number");
		n= sc.nextInt();
		System.out.println("number " +n);
		sc.close();
	}

}
