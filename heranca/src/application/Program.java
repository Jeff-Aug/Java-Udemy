package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Jefferson", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500);

		// UPCASTING

		Account acc1 = bacc;
		// atribuindo um objeto da subclass sendo atribudo na superclass
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200);
		Account acc3 = new SavingAccount(1004, "ana", 0.0, 2.5);

		// DOWNCASTING - Converte um objeto da superclass pra subclass

		/*
		 * BusinessAccount acc4 = acc2; acc2 -> tipo->account porr isso é necessario
		 * fazer um cast linha abaixo nao pode
		 */
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(1000);

		/* 
		 * BusinessAccount acc5 = (BusinessAccount)acc3; erro de compilação visto que
		 * acc3 é do tipo Account->SavingAccount e nao Account->BusinessAccount
		 * forma de concertar é utilizando o if a seguirr
		 */
		
		
		if(acc3 instanceof BusinessAccount) {
			//quando nao é instacia
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200);
			System.out.println("Loan!");
			
			
		}
		if(acc3 instanceof SavingAccount) {
			//quando é instacia

			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}

	}

}
