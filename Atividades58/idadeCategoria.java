package atividades58;

import java.util.Scanner;

public class idadeCategoria {
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 * categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto
*/
	public static void main(String[] args) {
		
		int idade;
		Scanner leia=new Scanner (System.in);
		
		System.out.println("\nDigite a idade da pessoa: ");
		idade=leia.nextInt();
		
		if(idade>=18 && idade<=25)
		{
			System.out.println("\nAdulto");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nJuvenil");
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.println("\nInfantil");
		}
		else
		{
			System.out.println("\nEntrada inválida");
		}
				
		

	}

}
