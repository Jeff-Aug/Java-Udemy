import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		
		double franquia = 50.00;
		int min;
		Scanner sc = new Scanner(System.in); 
		min = sc.nextInt();
		if (min <=100) {
			
			System.out.printf("Valor a ser pago %.2f",franquia);
			
		} else {
			System.out.printf("Valor a ser pago %.2f %n",(double) (min-100)*2);

		}

		

		sc.close();
	}


}
