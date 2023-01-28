package atividades58;

import java.util.Scanner;

/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um programa que leia o custo de fábrica de um carro e escreva o 
custo ao consumidor. 

Custo do consumidor = custo de fábrica + percentagem de distribuidor + impostos

percentagem do distribuidor = custo de fábrica * 28%

impostos = custo de fábrica * 45%

*/ 

public class calculando_Custo_do_Consumidor {

	public static void main(String[] args) {
		
		float custoConsumidor, custoFabrica, percImpostos, percDistribuidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o custo de fábrica do carro: ");
		custoFabrica=leia.nextFloat();
		
		percDistribuidor=(custoFabrica*28)/100;
		percImpostos=(custoFabrica*45)/100;
		
		custoConsumidor=custoFabrica+percDistribuidor+percImpostos;
		
		System.out.println("O custo total do consumidor é de: "+custoConsumidor);
		
		
		
		

	}

}
