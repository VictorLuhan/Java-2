package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverte cu = new CurrencyConverte();
		
		System.out.print("What is the dollar price? ");
		double dollarprice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount  = sc.nextDouble();
		double result = CurrencyConverte.dollarToReal(amount, dollarprice);
		System.out.printf("Amount to be paid in reais:%.2f", result);
		
	
	}

}
