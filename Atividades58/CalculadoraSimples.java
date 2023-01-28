package atividades58;

import java.util.Scanner;
/*
* Calculadora simples
*/
public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double primeiroNumero, segundoNumero, resultado = null;
		Integer operacao;
		
		System.out.print("Digite o primeiro número: ");
		primeiroNumero = scanner.nextDouble();
		
		System.out.println("Escolha qual operação será realizada: \n1-Soma \n2-Subtração \n3-Multiplicação"
				+ "\n4-Divisão");
		operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		segundoNumero = scanner.nextDouble();
		
		if(operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		else if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		else if(operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		else if(operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Resultado = "+ resultado);
		
		scanner.close();
	}

}
