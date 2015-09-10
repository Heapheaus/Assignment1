import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Hello out there.");
		System.out.println("I will add three numbers for you.");
		System.out.println("Enter three whole numbers on a line:");
		int n1, n2, n3;
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		System.out.println("The sum of these three numbers is");
		System.out.println(n1 + n2 + n3);
		keyboard.close();
	}
}
