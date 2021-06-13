package hitWeekly;

import java.util.Scanner;
import java.util.Random;
public class Rock
{ 
public static void main(String[] args) 
{ 
 String personPlay; 
 
int computerInt; 
String result = null ;
 Scanner scan = new Scanner(System.in); 
 //Random generator = new Random();
 System.out.println("Enter a key to start the Game  (R , P or S)"); 
 personPlay = scan.nextLine();
 System.out.println("personPlay Entered Values is "+personPlay);

 System.out.println("Enter a Number from this 0, 1 or 2 to Proceed"); 
 computerInt= scan.nextInt();
  switch (computerInt) 
 { 
 case 0:
		 result= "R";
		 System.out.println("computerPlay Entered Values is "+result);
		break;
 case 1:
		 result= "P";
		 System.out.println("computerPlay Entered Values is "+result);
		break;
case 2:
	 	result= "S";
	 	 System.out.println("computerPlay Entered Values is "+result);
	 	break;
default:
		System.out.println(" Enter Correct  Number");
		break;
		
 } 
 String computerPlay= result;

 if (personPlay.equals(computerPlay)) 
 {
	 System.out.println("It's a tie!"); 
 }
 else if (personPlay.equalsIgnoreCase("S")) 
	  if (computerPlay.equalsIgnoreCase("R")) 
		 System.out.println("scissors Crushed by Rock. You Lose!!");
	 else {
		 if (personPlay.equalsIgnoreCase("S")) 
		  if (computerPlay.equalsIgnoreCase("P")) 
		  System.out.println("scissors will cut paper. You win!!");
	      }
 else if (personPlay.equalsIgnoreCase("R")) 
	 if (computerPlay.equalsIgnoreCase("S")) 
		  System.out.println("Rock crushes scissors. You win!!"); 
	 else {
		 if (personPlay.equalsIgnoreCase("R")) 
	 	  if (computerPlay.equalsIgnoreCase("P")) 
          System.out.println("Rock Covered by Paper. You Lose!!"); 
	      }
 else if (personPlay.equalsIgnoreCase("P")) 
	   if (computerPlay.equalsIgnoreCase("R")) 
	      System.out.println("Paper will cover Rock. You win!!");
	 else {
		 if (personPlay.equalsIgnoreCase("P")) 
		  if (computerPlay.equalsIgnoreCase("S")) 
          System.out.println("Paper is cutted by Scissor . You Lose!!");
	 }
else
	
System.out.println("Enter Correct Data");
	 } 
}
