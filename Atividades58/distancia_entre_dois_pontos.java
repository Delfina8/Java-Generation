package atividades58;

import java.util.Scanner;

/*Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
Algoritmo que calcula a distância entre dois pontos exp=expoente, 
d=distância 
*/

public class distancia_entre_dois_pontos {

	public static void main(String[] args) {
		double x1, x2, y1, y2, subtracaoX, subtracaoY, soma;
		double d, exp1, exp2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o x1: ");
		x1=leia.nextFloat();
		System.out.println("Escreva o x2: ");
		x2=leia.nextFloat();
		System.out.println("Escreva o y1: ");
		y1=leia.nextFloat();
		System.out.println("Escreva o y2: ");
		y2=leia.nextFloat();
		
		subtracaoX=x2-x1;
		exp1=Math.pow(subtracaoX, 2); //expoente = 2
		subtracaoY = y2-y1;
		exp2=Math.pow(subtracaoY, 2); //expoente = 2
		
		soma = exp1+exp2;
		d=Math.sqrt(soma);
		
		System.out.printf("A distância entre os pontos é: %.3f",d);
				

	}

}
