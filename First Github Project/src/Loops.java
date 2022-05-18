
public class Loops {

	public static void main(String[] args) {
		int num=1;
		while(num<=10) {
			System.out.println(num++);
		}
		
		int column=0;
		while(column<5) {
			int row=0;
			while(row<=column) {
				System.out.print("*");
				++row;
			}
			System.out.println();
			++column;
		}
		int table =1;
		for(;;table++) {
			if(table%2!=0)
				continue;
			System.out.println(table);
			if(table==20)
			break;
		}
	}
}