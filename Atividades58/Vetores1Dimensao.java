package atividades58;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer saborEscolhido;
		
		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
		
		System.out.println("Escolha o sabor:");
		
		for(int i=0; i < cardapio.length; i++) {
			System.out.println("[" + i + "] " + cardapio[i]);
		}
		
		System.out.println("\nDigite o número referente ao sabor: ");
		saborEscolhido = scanner.nextInt();
		
		System.out.println("Você escolheu o sabor: "+cardapio[saborEscolhido]);
		
		scanner.close();
	}
	
}
