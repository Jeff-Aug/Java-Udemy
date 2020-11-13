import java.util.Scanner;

import entities.cadastro;

public class Program {

	public static void main(String[] args) {
		cadastro[] vetor = new cadastro[10];
		String nome, email;
		int tam, j,index=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		tam = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < tam; i++) {

			System.out.println("Rent #" + (i + 1));
			System.out.println("Nome");
			nome = sc.nextLine();
			System.out.println("Email");
			email = sc.nextLine();
			System.out.println("Room");
			j = sc.nextInt();

			vetor[j] = new cadastro(nome, email);
			sc.nextLine();
		}
//		for (int i = 0; i < 10; i++) {
//			if (vetor[i]!= null) {
//
//				System.out.print(i + ": ");
//				System.out.print(vetor[i].getNome()+", ");
//				System.out.print(vetor[i].getEmail());
//				System.out.println();
//			}
//		}
		for (cadastro doce : vetor) {
			if (doce != null) {

				System.out.print(index+1 + ": ");
				System.out.print(doce.getNome() + ", ");
				System.out.print(doce.getEmail());
				System.out.println();
			}
			index++;

		}

		sc.close();
	}

}
