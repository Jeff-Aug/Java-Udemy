import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		double y;
		char letra;
		x=3;
		String numero;
		Scanner sc  = new Scanner(System.in);
		y=  ( 5*x);
		numero = sc.next();
		x = sc.nextInt();
		y = sc.nextDouble();
		System.out.printf("%s%n", numero);
		System.out.printf("%d%n", x);
		System.out.printf("%.2f%n", y);
		letra = sc.next().charAt(0);
		System.out.printf("%c%n", letra);
		
		
		sc.close();
	}

}
