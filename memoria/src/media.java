import java.util.Scanner;

import entities.Product;

public class media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produto");
		int n = sc.nextInt();
		String produto;
		double price,media=0;
		Product [] vetor = new Product [n];
		
				
		for (int i = 0; i < n; i++) {
			produto = sc.nextLine();
			sc.nextLine();
			price = sc.nextDouble();
			 vetor[i] = new Product(produto, price,(media/n));
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println(vetor[i]);
			
		};
		
		
		sc.close();
	}

}



