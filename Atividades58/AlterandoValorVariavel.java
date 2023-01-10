package Atividades58;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Double juros = 0.0, acrescimo, valorTotal;
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		if(!pagamentoAVista) {
			juros = 10.0;
		}
		
		acrescimo = valorProduto * juros/100;
		valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		scanner.close();

	}

}
