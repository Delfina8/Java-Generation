package P_Orientada_Objetos;

public class animalPreguicaPolimorfismo extends animalPolimorfismo {
	
	public animalPreguicaPolimorfismo(String nome, int idade){
		super(nome,idade);
			
		}
		
		@Override
		public void som(String som)
		{
			System.out.println("\nA preguiça emite o som: ------ ");
		}
		
		@Override
		public void acao(String movimento)
		{
			System.out.println("\nA preguiça sobe em árvores");
		}
		
		
		public void imprimirInfo() {
			System.out.println("\nNome da Preguiça: "+getNome()+"\nIdade: "+getIdade());
		}
}
