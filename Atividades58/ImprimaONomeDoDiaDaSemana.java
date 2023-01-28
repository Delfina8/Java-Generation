package atividades58;

import java.util.Scanner;

/*
 * Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
 * Dependendo do número informado você deve imprimir o nome desse dia.
 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
 */
public class ImprimaONomeDoDiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int diaDaSemana;
		String NomeDoDiaDaSemana="";
		
		System.out.print("Digite o número referente ao dia da semana: ");
		diaDaSemana = scanner.nextInt();
		
		switch (diaDaSemana) {
		case 1: NomeDoDiaDaSemana = "Segunda-feira";
			break;
		case 2: NomeDoDiaDaSemana = "Terça-feira";
			break;
		case 3: NomeDoDiaDaSemana = "Quarta-feira";
			break;
		case 4: NomeDoDiaDaSemana = "Quinta-feira";
			break;
		case 5: NomeDoDiaDaSemana = "Sexta-feira";
			break;
		case 6: NomeDoDiaDaSemana = "Sábado";
			break;
		case 7: NomeDoDiaDaSemana = "Domingo";
			break;
		default: System.err.println("Digite um dia válido!");
		System.exit(0);
		}
		
		System.out.println(NomeDoDiaDaSemana);
		
		scanner.close();
		

	}

}
