package Atividades58;

import java.util.Scanner;

/* Um algoritmo que leia três números inteiros e positivos (A, B, C) e 
 *  calcule a seguinte expressão: 

R=(a+b)^2
S=(b+c)^2

D=(r+s)/2
*/
public class calcula_a_expressao {

	public static void main(String[] args) {
		int a,b,c,R,S; 
		double expS, expR, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número positivo: ");
		a=leia.nextInt();
		System.out.println("Escreva o segundo número positivo: ");
		b=leia.nextInt();
		System.out.println("Escreva o terceiro número positivo: ");
		c=leia.nextInt();
		
		R=a+b;
		expR=Math.pow(R, 2);
		S=b+c;
		expS=Math.pow(S, 2);
		
		D=(expR+expS)/2;
		
		System.out.println("O resultado do cálculo é: "+D);
				
	

	}

}
