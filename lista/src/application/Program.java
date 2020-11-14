package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat now = new SimpleDateFormat("dd/MM/yyyy");
		

		int tam;
		int tam2;
		double mensalidade;
		String nome;
		
		
		
		ArrayList<Aluno> cadastro = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno "+(i+1));
			System.out.println("Digite o nome: ");
			nome = sc.nextLine();
			
			System.out.println("Digite a mensalidade:");
			mensalidade = sc.nextDouble();
			Aluno aluno = new Aluno(nome,mensalidade,new Date());
			cadastro.add(aluno);
			sc.nextLine();
		}

		for (Aluno aluno : cadastro) {
			System.out.println("Aluno: " + aluno.getName() + " Mensalidade: "+ aluno.getMensa() );
			
		}
		
		tam = cadastro.size();
		System.out.println(tam);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
