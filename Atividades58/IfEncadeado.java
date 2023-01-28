package atividades58;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		
		double peso;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso > 0) && (peso <= 60);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("O(A) lutador(a) é peso leve.");
		} else if(pesoMedio) {
			System.out.println("O(A) lutador(a) é peso médio.");
		} else if (pesoPesado) {
			System.out.println("O(A) lutador(a) é peso pesado.");
		} else {
			System.out.println("O(A) lutador(a) não se encaixa em categoria alguma.");
		}
		
		scanner.close();
		
	}

}
