package atividades58;

import java.util.Scanner;

/* Faça um programa que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */

public class idade_em_meses_paraDias {

	public static void main(String[] args) {
		int idAnos,idDias,idMeses,ano=365,meses=30,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade: ");
		idAnos=leia.nextInt();
		System.out.println("\nDigite a sua idade em meses: ");
		idMeses=leia.nextInt();
		System.out.println("\nDigite a sua idade em dias: "); //essa informação não será levada em conta no cálculo
		idDias=leia.nextInt();
		
		idDias=idAnos*ano; // Idade em dias = idade em anos multiplicada por 365 dias
		idMeses=idMeses*meses; //Convertendo a idade em meses para dias
		soma=idDias+idMeses;
		
		System.out.println("\nA sua idade em dias é: "+soma);
		
		leia.close();
	}

}
