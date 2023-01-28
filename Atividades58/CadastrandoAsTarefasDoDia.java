package atividades58;

import java.util.Scanner;

/*
 * Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes
 * do dia dele. Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
 */

public class CadastrandoAsTarefasDoDia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String[] tarefas = new String[5];
		
		System.out.print("Cadaste 5 tarefas importantes");
		
		for(int i=0; i < tarefas.length; i++) {
			
				System.out.print("\nTarefa " + i + ": ");
				tarefas[i] = scanner.nextLine();
		}
		
		System.out.println("Tarefas cadastradas");
		for(int i=0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		scanner.close();

	}

}
