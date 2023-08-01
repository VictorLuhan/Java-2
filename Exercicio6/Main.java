package Main;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		triangulo = (A * C)/2.0;
		circulo = pi * C * C;
		trapezio = (A + B)/2.0 *C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO = %.3f ", triangulo);
		System.out.printf("%nCIRCULO = %.3f", circulo);
		System.out.printf("%nTRAPEZIO = %.3f", trapezio);
		System.out.printf("%nQUADRADO = %.3f", quadrado);
		System.out.printf("%nRETANGULO = %.3f", retangulo);
		
		
		
	}

}
