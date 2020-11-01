import java.util.Scanner;

import util.calculateDol;

public class dolar {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		calculateDol preco = new calculateDol();
		double valor ,Price_dolar;
		Price_dolar = sc.nextDouble();
		
		valor = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f ",preco.calu(Price_dolar, valor)*1.06);
		
		sc.close();
	}

}
