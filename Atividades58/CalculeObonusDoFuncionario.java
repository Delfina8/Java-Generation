package Atividades58;

/*
 * Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, 
 * caso a meta seja alcançada.
 * 
 * Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa
 * para o ano que passou. Depois, receba o parâmetro referente ao faturamento real da empresa no 
 * ultimo ano. Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa
 * fazer cálculo de média salarial, já que estamos trabalhando com um algoritmo fictício - na hora de 
 * informar esse parâmetro, invente um valor qualquer para representar essa média salarial).
 * 
 * Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual,
 * então os funcionários ganharam um bônus que será igual a média salarial deles no último ano. Caso o
 * faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então eles 
 * receberão também 80% de sua média salarial.
 * 
 * No final, mostre de quanto será o prêmio desse funcionário(a).
 * 
 */

import java.util.Scanner;

public class CalculeObonusDoFuncionario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double metaDeFaturamentoAnual, faturamentoReal, mediaSalarialDoFuncionario, oitentaPorCentoDoValorDaMeta,
		oitentaPorCentoDaMediaSalarial;
		
		System.out.print("Meta de faturamento anual da empresa: ");
		metaDeFaturamentoAnual = scanner.nextDouble();
		
		System.out.print("Faturamento real da empresa no último ano: ");
		faturamentoReal = scanner.nextDouble();
		
		System.out.print("Média salarial do funcionário(a): ");
		mediaSalarialDoFuncionario = scanner.nextDouble();
		
		oitentaPorCentoDoValorDaMeta = (metaDeFaturamentoAnual * 80)/100;
		
		Boolean ganharBonus = faturamentoReal >= metaDeFaturamentoAnual;
		Boolean receberOitentaPorCentoDoValorDaMeta = (faturamentoReal < metaDeFaturamentoAnual) && (faturamentoReal >= oitentaPorCentoDoValorDaMeta);
		
		if(ganharBonus) {
			System.out.println("Parabéns! Você ganhou um bônus de: "+mediaSalarialDoFuncionario);
		
		} else if(receberOitentaPorCentoDoValorDaMeta) {
			
			oitentaPorCentoDaMediaSalarial  = (mediaSalarialDoFuncionario * 80)/100;
			System.out.println("Parabéns! Você ganhou 80% de sua média salarial: "+oitentaPorCentoDaMediaSalarial);
		
		} else {
			System.out.println("Infelizmente, nesse ano não tem bônus!");
		}
		
		scanner.close();

	}

}
