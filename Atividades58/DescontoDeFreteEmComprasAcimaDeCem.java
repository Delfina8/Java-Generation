package atividades58;

import java.util.Scanner;

/* Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
 * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete 
 * como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
	Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
 */
public class DescontoDeFreteEmComprasAcimaDeCem {
	
	static final double FRETE = 15.00;
	
	public static void main(String[] args) {
		
		Double valorProduto=0.0, valorFinalDaCompra;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor do produto: ");
		valorProduto = scanner.nextDouble();
		
		Boolean cobrarFrete = valorProduto<100;
		
		if(cobrarFrete) {
			valorFinalDaCompra = valorProduto + FRETE;
		} else {
			valorFinalDaCompra = valorProduto;
		}
	
		System.out.println("Valor da compra: "+valorFinalDaCompra);
		
		scanner.close();
		
	}

}
