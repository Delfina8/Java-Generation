package Atividades58;

/* Crie um programa que leia um número do teclado até  
 * que encontre um número igual a zero. No final, mostre a soma 
 * dos números digitados.(DO...WHILE)
 * 
 */

import java.util.Scanner;

public class LacodeRepeticao_Do_While {

	public static void main(String[] args) {
		
		int numeros, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPara sair digite 0");
		
		do
		{
			System.out.println("\nDigite um número: ");
			numeros = leia.nextInt();
			soma+=numeros; //soma=soma+numeros
			
		}
		while(numeros!=0);
		
		
		System.out.println("\nO total da soma dos números digitados é: "+soma);
	}
	

}
