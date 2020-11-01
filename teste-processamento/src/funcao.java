import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os tres numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int higher  = maiorDeTodos(a,	b,	c);  
		mostraOBagulho(higher);
		sc.close();
	}
	
	public static int maiorDeTodos(int x, int y,  int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void mostraOBagulho(int maior) {
		System.out.println("O maior de todos eh :" + maior);
	}

}
