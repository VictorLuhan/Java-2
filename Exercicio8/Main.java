package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner fc = new Scanner(System.in);
		
		int x;
		
		x = fc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

	}

}
