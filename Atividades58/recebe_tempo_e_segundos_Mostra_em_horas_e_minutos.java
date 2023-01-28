package atividades58;

import java.util.Scanner;

/* Faça um programa que leia o tempo de duração de um evento em uma fábrica expressa 
 * em segundos e mostre-o expresso em horas, minutos e segundos. 
 * 
 */
public class recebe_tempo_e_segundos_Mostra_em_horas_e_minutos {

	public static void main(String[] args) {
		float Thoras, Tminutos, Tsegundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o tempo de duração do evento(Tempo em segundos): ");
		Tsegundos=leia.nextFloat();
		
		Tminutos=Tsegundos/60; //Existem 60 segundos em cada minuto, então converter segundos para minutos: basta dividir o número por 60!
		Thoras=Tminutos/60; 
		
		System.out.println("\nTempo de duração em horas: "+Thoras);
		System.out.println("\nTempo de duração em minutos: "+Tminutos);
		System.out.println("\nTempo de duração em segundos: "+Tsegundos);

		leia.close();
	}
	
}
