package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		String name;
		double price,customsFee;
		char response;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int qte = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qte; i++) {
			System.out.println("Product #"+i+" data");
			System.out.println("Common, used or imported (c/u/i)?");
			response = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name:");
			name = sc.nextLine();
			
			System.out.println("Price: ");
			price = sc.nextDouble();
			sc.nextLine();
			
			
			switch (response) {
			case 'i':
				System.out.println("costoms fee: ");
				customsFee = sc.nextDouble();
				sc.nextLine();
				Product produc = new ImportedProduct(name,price,customsFee);
				list.add(produc);
				break;
			case 'c':
				Product produc1 = new Product(name,price);
				list.add(produc1);
				break;
				

			default:
				
				Product produc2 = new UsedProduct(name,price,new Date());
				list.add(produc2);
				break;
			}
			
			
			
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
