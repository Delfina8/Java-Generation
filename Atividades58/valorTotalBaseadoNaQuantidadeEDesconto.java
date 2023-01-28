package atividades58;

import java.util.Scanner;

/*Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
 * Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
 * Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for 
 * maior que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se 
 * for menor que 10, você NÃO aplica desconto algum. 
 * Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
 * você multiplica o subtotal pelo próprio percentual e divide tudo por 100. Tendo o valor referente ao 
 * percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total 
 * final e deverá ser apresentado no console.
 * 
 */
public class valorTotalBaseadoNaQuantidadeEDesconto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double valorProduto, percentualDesconto=0.0, subtotal, total;
		Integer quantidadeProduto;
		
		System.out.print("Digite o valor do produto: ");
		valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		quantidadeProduto = scanner.nextInt();
		
		subtotal = quantidadeProduto * valorProduto;
		
		Boolean aplicarDesconto =  quantidadeProduto>=10;
		
		if(aplicarDesconto) {
			System.out.print("Desconto de 10%!");
			percentualDesconto = subtotal*10/100;
			total = subtotal-percentualDesconto;
		} else {
			total = subtotal;
		}
		
		System.out.println("\nValor total: "+total);
		
		scanner.close();

	}

}
