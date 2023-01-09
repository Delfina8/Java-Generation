package Atividades58;

/*Na empresa em que trabalhamos, há tabelas com o quanto foi gasto em cada mês.
 * Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
 * Sabendo que, em janeiro, foram gastos 15.000 reais, em fevereiro, 23.000 reais,
 *  e, em março, 17.000 reais, faça um programa que calcule e imprima o gasto 
 *  total no trimestre e a média mensal de gastos.
 */
public class GastoTotalTrimestre {

	public static void main(String[] args) {
		int gastosJaneiro=15000;
		int gastosFevereiro=23000;
		int gastosMarco=17000;
		int gastoTotal;
		float mediaGastos;
		
		
		gastoTotal=gastosJaneiro+gastosFevereiro+gastosMarco;
		mediaGastos = gastoTotal/3;
		
		System.out.println("O gasto total do trimestre foi de: "+gastoTotal);
		System.out.println("A média mensal dos gastos é: "+mediaGastos);
		
		

	}

}
