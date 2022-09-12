package Atividades58;

import java.util.Scanner;

/* Faça um programa que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias (considere que: 1 ano = 365 dias /
 * 1 mês = 30 dias e 1 dia = 1 dia em todos os casos).
 * 
*/
public class idade_em_dias_paraAnosMeses {

	public static void main(String[] args) {
		
		int idDias,idAnos,idMeses,idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias(idade*365): ");
		idDias=leia.nextInt();
		
		idAnos=idDias/365;
		idMeses=idDias/30;
			
		
		System.out.println("\nVocê viveu "+idAnos+" ano(s), "+idMeses+" mês(meses)");
		System.out.println("\nIdade em dias: "+idDias);

	}

}
