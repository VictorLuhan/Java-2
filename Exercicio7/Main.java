package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner fc = new Scanner(System.in);
		
		int x;
		
		x = fc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

	}

}
