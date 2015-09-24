import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * Author Teddy Church
 * 
 * INIT equation array
 * DISPLAY quation array
 * PROMPT user for 5 intigers
 * READ  intigers
 * CALCULATE sum
 * CALCULATE average
 * CALCULATE median
 * CALCULATE min 
 * CALCULATE max
 * READ 
 * DISPLAY sum, average, median, min, max 
 * /

public class Assignment2 {
	public static void main(String[] args) {
	//Part1
		System.out.println("The equation 1/2 is equal to: " + 1/2);
		System.out.println("The equation 1%2 is equal to: " + 1%2);
		System.out.println("The equation 1.0/2 is equal to: " + 1.0/2);
		System.out.println("The equation  5 + 7 / 2 is equal to: " +  (5 + 7 / 2));
		System.out.println("The equation \"Beat\" + ' ' + \"Army\" is equal to: " + "Beat" + ' ' + "Army");
		System.out.println("The equation 6 + 13 / 5 - 35 % 3 is equal to: " + (6 + 13 / 5 - 35 % 3));
		System.out.println("The equation 3.5 * (5/4) is equal to: " + (3.5 * (5/4)));
		System.out.println("The equation (3.5 * 5)/4 is equal to: " + ((3.5 * 5)/4));
		
	 //Part2
		Scanner keyboard = new Scanner (System.in);
		 int[] IntegerList =new int[5];
		 
		 System.out.println("Enter 5 integers: ");
          Scanner userinput=new Scanner(System.in);
          for(int i=0;i<5;i++){
        	  IntegerList[i] = keyboard.nextInt();
          }
          for(int i=0;i<5;i++){
        	 System.out.print(""+IntegerList[i]+", ");
          }
          	 System.out.println("");
              keyboard.close();
           
		Arrays.sort(IntegerList);
		int sum = 0;

		 for (int i : IntegerList)
		     sum += i;
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The Average: " + ((sum)/5));
		System.out.println("The Median: "  + IntegerList[2]);
		System.out.println("Minimum: " + IntegerList[0]);
		System.out.println("Maximum: " + IntegerList[4]);
		
		   
	}

}
