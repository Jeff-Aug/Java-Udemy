import java.util.Scanner;

import entities.Product;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product mercadoria = new Product();
		
		
		
		mercadoria.name = sc.nextLine(); 
		mercadoria.Price = sc.nextDouble(); 
		mercadoria.qte = sc.nextInt(); 
		
		
		System.out.println(mercadoria);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int a=sc.nextInt();
		mercadoria.alterar(a);
	
		a=sc.nextInt();
		System.out.println("Enter the number of products to be removed from stock: ");
		mercadoria.remover(a);
		
		
		sc.close();
	}

}
