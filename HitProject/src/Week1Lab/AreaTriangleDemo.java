package Week1Lab;

import java.util.Scanner;

public class AreaTriangleDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the Triangle: ");
		double width = scanner.nextDouble();
		System.out.println("Enter the height of the Triangle: ");
		double height = scanner.nextDouble();
		double area = (width* height)/2; // Or (base*height)/2
		System.out.println("Area of Triangle is: " + area);

	}

}
