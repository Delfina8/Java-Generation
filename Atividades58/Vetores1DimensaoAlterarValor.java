package atividades58;

public class Vetores1DimensaoAlterarValor {

	public static void main(String[] args) {
		
		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
		
		//Alterar um item do vetor
		cardapio[3] = "Frango";
		
		for(int i=0; i < cardapio.length; i++) {
			System.out.println("[" + i + "] " + cardapio[i]);
		}
		
		//Adicionar itens no vetor depois de criá-lo
		
		String[] cardapioDois = new String[4]; //4 representa a quantidade de itens que o vetor irá armazenar, ou seja, o tamanho do vetor
		
		cardapioDois[0] = "Calabresa";
		cardapioDois [1] = "Atum";
		cardapioDois[2] = "Queijo";
		cardapioDois[3] = "Presunto";
		
		for(int i=0; i < cardapioDois.length; i++) {
			System.out.println("\n[" + i + "] " + cardapio[i]);
		}
		

	}

}
