package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List <String> list = new  ArrayList<> ();
		
		list.add("jaca");
		list.add("melao");
		list.add("jabuticaba");
		list.add("morango");
		list.add(2,"caigata");
		
		list.add("limao");
		list.add("cereja");
		System.out.println(list.size());//tamanho
		
		for (String fruta : list) {
			System.out.println(fruta);
			
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0)== 'j');
		for (String fruta : list) {
			System.out.println(fruta);
			
		}
		
	}

}
