package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner fc = new Scanner(System.in);
		
		int A;
		int B;
		
		A = fc.nextInt();
		B = fc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}

	}

}