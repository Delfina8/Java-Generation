package List;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListaExemplo1 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		
		name.add("José");
		name.add("Maria");
		name.add("João");
		
		/* name.remove(0);
		
		System.out.println(name); */
		
		/*
		for (int i=0; i<name.size();i++) {
			System.out.println("Nome: " + name.get(i));
		}
		*/
		
		/*
		//Outra forma
		for(String names : name) {
			System.out.println("\nNome: "+ names);
		}
		*/
		
		name.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);	
			}
	
		});
		
		//Outra forma
		name.forEach(names -> {
			System.out.println(names);});
		
		//Outra forma
		name.forEach(System.out::println);
	}
	
		


}
