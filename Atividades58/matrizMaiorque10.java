package atividades58;

import java.util.Scanner;

public class matrizMaiorque10 {

	public static void main(String[] args) {
		
	float[][] matriz = new float[3][3];
	int linha,coluna,cont10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++) 
			{
			System.out.printf("Digite o elemento M[%d][%d]: ",linha+1,coluna+1);
			matriz[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("Os elementos da matriz maiores que 10 são:");
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++) 
		{
			if(matriz[linha][coluna]>10)
			{
				cont10++;	
				System.out.println(matriz[linha][coluna]);
			}
	}

}
}
}
