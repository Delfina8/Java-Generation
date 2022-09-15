package Atividades58;

import java.util.Scanner;

/* Faça um programa que entre com três números e coloque em ordem crescente
 * 
 */
public class ordemCrescenteTresNumeros {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		n1=read.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2=read.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3=read.nextInt();
		
		if(n1<n2) {
			if(n2<n3)
			{
				System.out.println(n1+"-"+n2+"-"+n3);
			}
			
			else if(n1<n3)
			{
				System.out.println(n1+"-"+n3+"-"+n2);
			}
			
			else
			{
				System.out.println(n3+"-"+n1+"-"+n2);
				
			}
			
	}
		else if (n2<n3) {
			if(n1<n2)
			{
				System.out.println(n2+"-"+n1+"-"+n3);
			}
			
			else
			{
				System.out.println(n2+"-"+n3+"-"+n1);
			}
		}
			else
			{
				System.out.println(n3+"-"+n2+"-"+n1);
				
			}
	}
}
