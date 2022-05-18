import java.util.Scanner;
class Addition{
	public int performAddition(int num1, int num2) {
		return(num1+num2);
	}
}

public class AdditionMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Addition sum=new Addition();
		System.out.println(sum.performAddition(num1,num2));
		sc.close();

	}

}
