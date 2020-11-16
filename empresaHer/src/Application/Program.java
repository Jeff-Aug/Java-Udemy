package Application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		String name;
		Integer hours;
		double valueHours,additionalCharge;
		Scanner sc = new Scanner(System.in);
		char response;

		ArrayList<Employee> listAll = new ArrayList<Employee>();

		System.out.println("Enter the number of employess:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data");

			System.out.println("Outsourced (y/n)");
			response = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Hours: ");
			hours = sc.nextInt();
			System.out.println("Value per hours: ");
			valueHours = sc.nextDouble();

			if (response == 'y') {
				System.out.println("Addintional Charge: ");
				additionalCharge = sc.nextDouble();
				Employee listTer = new OutsourceEmployee(name, hours, valueHours, additionalCharge);
				listAll.add(listTer);
			
			
			} else {
				Employee list = new Employee(name, hours, valueHours);
				listAll.add(list);

			}

		}
		System.out.println("PAYMENTS: ");
		for (Employee emp : listAll) {
			System.out.println(emp.getName() +" - " + String.format("%.2f",emp.payment()));
		}

		sc.close();

	}

}
