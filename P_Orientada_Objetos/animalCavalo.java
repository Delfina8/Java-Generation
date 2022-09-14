package P_Orientada_Objetos;

public class animalCavalo extends Animal {
	
	//Atributo
	private String deveCorrer;
	
	public animalCavalo(String nome, int idade, String som, String deveCorrer) {
		super(nome,idade,som);
		
		this.setDeveCorrer(deveCorrer);
	}
	
	//Métodos de classe

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nEmitir som: "+getSom()
		+"\nAção/O que ele faz: "+deveCorrer);
	}
	

}
