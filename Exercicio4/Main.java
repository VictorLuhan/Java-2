package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int numberFun;
		double valorhoras;
		double horas;
		double salario;
		
		numberFun = sc.nextInt();
		horas = sc.nextDouble();
		valorhoras = sc.nextDouble();
		
		salario = horas * valorhoras;
		
		
		System.out.printf("NUMBER = " + numberFun );
		System.out.printf("%nSALARY U$ = %.2f", salario);

	}

}
