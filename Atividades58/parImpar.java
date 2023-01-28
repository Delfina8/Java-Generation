package atividades58;

import java.util.Scanner;

/* Faça um programa em que permita a entrada de um número qualquer e exiba se 
 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
 * se for ímpar exiba o número elevado ao quadrado.
 * 
 */

public class parImpar {

	public static void main(String[] args) {
		
		int num;
		double resultado;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num=read.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Este número é par!");
			resultado=Math.sqrt(num);
		}
		else
		{
			System.out.println("Este número é ímpar!");
			resultado=Math.pow(num, 2);
		}
		
		System.out.println("Resultado: "+resultado);
		
		read.close();
	}
	

}
