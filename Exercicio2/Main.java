package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		double pi;
		double raio;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		A = pi * raio * raio;
		
		System.out.printf("A = %.4f",  A);

	}

}
