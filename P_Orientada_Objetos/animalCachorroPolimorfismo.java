package P_Orientada_Objetos;

public class animalCachorroPolimorfismo extends animalPolimorfismo {
	
	
		
		public animalCachorroPolimorfismo(String nome, int idade){
		super(nome,idade);
			
		}
		
		@Override
		public void som(String som)
		{
			System.out.println("\nO cachorro late: Au au au");
		}
		
		@Override
		public void acao(String movimento)
		{
			System.out.println("\nO cachorro corre");
		}
		
		
		public void imprimirInfo() {
			System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade());
		}

}
