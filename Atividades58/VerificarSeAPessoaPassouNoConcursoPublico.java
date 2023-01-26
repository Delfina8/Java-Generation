package Atividades58;

import java.util.Scanner;

/*Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
 * Serão dois parâmetros para receber um para receber a nota de português e outro para receber 
 * as de matemática. A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total 
 * para passar é igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que 60 
 * pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática
 * (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 * No final mostre para o candidato se ele conseguiu ou não.
 */

public class VerificarSeAPessoaPassouNoConcursoPublico {

	static final Double NOTA_MINIMA = 60.0;
	static final Double  NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double notaMatematica, notaPortugues, notaTotal;
		
		System.out.print("Nota de matemática: ");
		notaMatematica = scanner.nextDouble();
		
		System.out.print("Nota de português: ");
		notaPortugues = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaPortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaMatematica >= NOTA_MINIMA;
		
		notaTotal = notaPortugues + notaMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println("Parabéns! Você passou.");
		} else {
			System.out.println("Infelizmente, não foi dessa vez.");
		}
		
		scanner.close();

	}

}