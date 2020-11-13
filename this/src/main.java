import java.util.Scanner;

import entities.getset;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		getset doce = new getset();
		
		
		System.out.println(doce.getJaca());
		String fruta = sc.next();
		System.out.println(doce.pamonha);
		
		System.out.println(doce.getJaca());
		
		sc.close();
	}

}
