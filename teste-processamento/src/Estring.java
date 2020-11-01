
public class Estring {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABc DEFG";
		String s01 = original.toLowerCase();
		
		String [] vect = original.split(" ");// forma de corta a string nesse caso o divisor eh " " espaco		
		String parte1 = vect[0];
		String parte2 = vect[1];
		String parte3 = vect[2];
		String parte4 = vect[3];
		
		System.out.println(s01.toLowerCase());
		System.out.println(s01.toUpperCase());
		System.out.println(s01.substring(3,	 9));
		System.out.println(s01.replace("a", "jaca"));
//		substituicao de caracter por uma letra ou um conjunto de letras
		System.out.println(s01.substring(3));//		de onde eu quero iniciar minha string

		
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
		System.out.println(parte4);
		
		/*
		 * 
		 * 
		 * */
	}

}
