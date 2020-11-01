import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {
		int n, x = 89,y=60, mask = 0b1001000; // forma de declara um numero na forma binaria		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(x | y);
		System.out.println(x & y);
		System.out.println(x ^ y);
		
		System.out.println(mask);
		
		if ((n & mask)!= 0) {
			System.out.println("A mascara nao passou");// significa que de acordo com a mascara os bit 4 e o 7 estao no numero 			
			
		} else {
			System.out.println("A mascara  passou");// significa que de acordo com a mascara os bit 4 e o 7 estao no numero 			

		}

		sc.close();
	}
	

}
