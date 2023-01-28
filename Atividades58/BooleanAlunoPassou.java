package atividades58;

import java.util.Scanner;

/* Crie um programa que informa se o aluno passou de ano
 * O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica 
 * para saber se a nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a 
 * uma variável do tipo Boolean.
 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir,
 *  no console, uma mensagem que vai dizer se o aluno passou ou não passou.
 */
public class BooleanAlunoPassou {
	
	static final int NOTA_PARA_APROVAR_NA_MATÉRIA = 70;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		double grade;
		
		System.out.print("Enter the student´s grade: ");
		grade=scanner.nextDouble();
		
		Boolean approved = grade>=NOTA_PARA_APROVAR_NA_MATÉRIA;
		
		if (approved) {
			System.out.println("Congratulations! You have been approved!");
		} else {
			System.out.println("You have failed");
		}
		
		scanner.close();
		

	}

}
