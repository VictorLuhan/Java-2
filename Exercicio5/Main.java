package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberPeca1;
		int codigoPeca1;
		double valorPeca1;
		
		int numberPeca2;
		int codigoPeca2;
		double valorPeca2;
		double valorpago;
		
		numberPeca1 = sc.nextInt();
		codigoPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		numberPeca2 = sc.nextInt();
		codigoPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorpago = numberPeca1 * valorPeca1 + numberPeca2 * valorPeca2;
		
		System.out.printf("Valor a ser PAGO = %.2f", valorpago);


	}

}
