package Atividades58;

import java.util.Scanner;

/* Solicitar a idade de várias pessoas e imprimir
 * Total de pessoas com menos de 21 anos. Total de pessoas 
 * com mais de 50 anos. O programa termina quando idade for =-99.
 * (WHILE)
 */

public class IdadePessoas_Repetição_While {

	public static void main(String[] args) {
		
		int idade, idade21=0, idade50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPara sair digite -99");
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				idade21++;
			}
			else if(idade>50)
			{
				idade50++;
			}
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+idade21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+idade50);
		
		
	}

}
