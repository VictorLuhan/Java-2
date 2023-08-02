package Main;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			double x = sc.nextDouble();
		    double y = sc.nextDouble();
			if(y == 0) {
				System.out.println("Divisão impossivel");
				}
			else {
			   System.out.print(x/y);
			}
		}
		sc.close();
		

	}

}
