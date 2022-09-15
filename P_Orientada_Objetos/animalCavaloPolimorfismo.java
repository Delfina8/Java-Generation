package P_Orientada_Objetos;

public class animalCavaloPolimorfismo extends animalPolimorfismo {

	public animalCavaloPolimorfismo(String nome, int idade){
		super(nome,idade);
			
		}
		
		@Override
		public void som(String som)
		{
			System.out.println("\nO cavalo relincha: Relinchando ");
		}
		
		@Override
		public void acao(String movimento)
		{
			System.out.println("\nO cavalo corre");
		}
		
		
		public void imprimirInfo() {
			System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade());
		}
}
