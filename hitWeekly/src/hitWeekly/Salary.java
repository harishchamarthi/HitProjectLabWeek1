package hitWeekly;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main(String[] args) {
		double currentSalary; 
		double raise = 0; 
		double newSalary; 
		String rating; 
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating(Excellent, Good, or Poor): ");
		scan.nextLine();
		rating = scan.nextLine();
		System.out.println ("For Given rating: ");
		if (rating.equalsIgnoreCase("Excellent"))
		{
			raise=currentSalary*0.06;	
		}
		else if(rating.equalsIgnoreCase("Good"))
		{
			raise=currentSalary*0.04;
		}
		else if(rating.equalsIgnoreCase("poor")){
			raise=currentSalary*0.015;
		}
		else {
			System.out.println("The given rating is not Valid");
		}
		
		newSalary = currentSalary + raise;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: " +money.format(currentSalary));
		System.out.println("Amount of your raise: " +money.format(raise));
		System.out.println("Your new salary: " +money.format(newSalary));
		System.out.println();
		
		}

}
