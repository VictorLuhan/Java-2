package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if(numero < 0.0 || numero > 100.00) {
			System.out.println(" fora do intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if(numero <= 50.00) {
			System.out.println("Intervalo [25,50]");
		}
		else if(numero <= 75.00) {
			System.out.println("Intervalor [50,75]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}

	}

}
