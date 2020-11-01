package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.triangulo;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		triangulo x ,y; 
		
		x = new triangulo();
		y = new triangulo();
		
		
		System.out.println("Entre com as medidas do tringulo X");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
	
		
		
		System.out.println("Entre com as medidas do tringulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		
		
		System.out.printf("Area do tringulo X - %.3f %n",x.area());
		System.out.printf("Area do tringulo Y - %.3f",y.area());
		sc.close();
		
	}

}
