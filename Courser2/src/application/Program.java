package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.right = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rec.area());
		System.out.printf("Parameter: %.2f%n", rec.parameter());
		System.out.printf("Diagonal: %.2f", rec.diagonal());
	

	}

}
