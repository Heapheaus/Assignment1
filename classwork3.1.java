import java.util.Scanner;
public class classwork {

	public static void main(String[] args) {
		//From top to bottom of the requirements
		String Classwork = "Classwork string for 3.1";
		System.out.printf("%s", Classwork);
		System.out.printf("%S", Classwork);
		System.out.println("");
		
		char see = 'C';
		System.out.printf("%c", see);
		System.out.printf("%C", see);
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);
		int number = (int)keyboard.nextDouble();
		System.out.printf("%d", number);
		System.out.println("");
		
		double expo = keyboard.nextDouble();
		System.out.format("%e", expo);
		System.out.println("");
		
		double floating = keyboard.nextDouble();
		System.out.printf("%.2f", floating);
		System.out.println("");

		keyboard.close();
		 /* 
		  * String classwork
		  * character
		  * int number
		  * double exponent
		  * double floating number
		  */
	}

}
