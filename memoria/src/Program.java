import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int n = sc.nextInt();
		double [] vetor = new double [n];
		double media =0;
		
		
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		}
		
		System.out.println(media/n);
		
		
		
		
		sc.close();
	}

}
