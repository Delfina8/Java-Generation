package atividades58;

import java.util.Scanner;

/* Ler 10 números e imprimir quantos são pares e quantos
 * são ímpares. (FOR) 
 */

public class Par_ímpar_Repetição_For {

	public static void main(String[] args) {
		
		int numeros, x, contPar=0, contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nDigite um número: ");
			numeros=leia.nextInt();
			
			if(numeros%2 == 0)
			{
				contPar++;
			}
			else
			{
				contImpar++;
			}
		}
		System.out.println("\nTemos: "+contPar+" números pares");
		System.out.println("\nTemos: "+contImpar+" números ímpares");
		
	}

}
