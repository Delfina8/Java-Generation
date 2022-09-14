package P_Orientada_Objetos;

public class animalPreguica extends Animal{

	//Atributo
		private String subirArvore;
		
		public animalPreguica(String nome, int idade, String som, String subirArvore) {
			super(nome,idade,som);
			
			this.setSubirArvore(subirArvore);
		}
		
		//Métodos de classe

		public String getSubirArvore() {
			return subirArvore;
		}

		public void setSubirArvore(String subirArvore) {
			this.subirArvore = subirArvore;
		}
		
		public void imprimirInfo() {
			System.out.println("\nNome da Preguiça: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getSom()
			+"\nAção/O que ele faz: "+subirArvore);
		}
		
}
