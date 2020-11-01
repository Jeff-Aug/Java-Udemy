import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String  s1,s2,s3;
		int x = sc.nextInt();
		
		sc.nextLine();//limpwza do buffer de leituraeh necessario por conta da linha pendente que eh armazenada (%n) no x
		s1= sc.nextLine();
		s2= sc.nextLine();
		s3= sc.nextLine();
		
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1+s2+s3);
		
		sc.close();
	}

}
