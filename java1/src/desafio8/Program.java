package desafio8;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("silvana");
		list.add("sirleia");
		list.add("simone");
		list.add("helena");
		
		list.add(2, "valdina");
		
		System.out.println("o tamanho da lista e:  " + list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}

}
