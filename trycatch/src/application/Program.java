package application;

public class Program {

	public static void main(String[] args) {
		int [] num1 = {2,0,8,9,0,8};
		int [] num2 = {7,6,8,9,0,8,9};

		for (int i = 0; i < num2.length; i++) {
			
			try {
				
				System.out.println(num2[i]+" / "+num1[i] +" = "+ num2[i]/num1[i]);
						
			}catch(Throwable e) {
				
				
				System.out.println("Não existe essa posicão no array  Não se pode dividir por zero");
				
			}finally {
				System.out.println("jaca");
			}
		}
		
		
	}

}
