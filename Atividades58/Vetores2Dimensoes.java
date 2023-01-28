package atividades58;

public class Vetores2Dimensoes {

	public static void main(String[] args) {
		
		Double faturamentoDia = 1000.0, dia;
		
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double [] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1800.0 };
		
		//Vetor de duas dimensões
		Double [][] faturamentoAnual = new Double [][] {faturamentoJaneiro, faturamentoFevereiro};
		
		System.out.println("Faturamento do dia 1º de Janeiro: " + faturamentoAnual[0][0]);
		System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);
		
		for(int i=0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i+1)); //Para começar a exibir a partir do mês 1 (i+1) / Estou somando com um, pois, não quero mostrar de 0 a .... e sim de 1 a ...
			
			for(int y=0; y < faturamentoAnual[i].length; y++) {
				
				dia = faturamentoAnual[i][y];
				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}
	}

}
