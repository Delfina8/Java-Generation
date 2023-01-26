package Atividades58;

import java.util.Scanner;

public class vetor_6inteiros {

	public static void main(String[] args) {
		
		int[] num =new int [6];
		int x, somaPar=0,contImpar=0,contPar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nDigite um número inteiro: ");
			num[x]=leia.nextInt();
			
			if(num[x]%2 == 0)
			{
				contPar++;
				somaPar+=num[x];
			}
			else
			{
				contImpar++;
			}
			
		}
		System.out.println("\nNúmeros pares digitados: ");
		for(x=0;x<6;x++)
		{
			if(num[x]%2 == 0)
			{
				System.out.println(num[x] + " ");
			}
		}
		
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nTemos: "+contImpar+" números ímpares");
		
		System.out.println("\nNúmeros ímpares digitados: ");
		
		for(x=0;x<6;x++)
		{

			if (num[x]%2 !=0)
			{
			System.out.println(num[x] + " ");
			}
		}
		
			System.out.println("\nQuantidade de números ímpares digitados: "+contImpar);
			
			leia.close();
		}
	
	

}
