package P_Orientada_Objetos;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos 
 * e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
 *  as características de forma que tudo o que for comum a todos os animais fique 
 *  na classe Animal: 
 */
public class Animal {
	
	//Atributos
	private String nome;
	private int idade;
	private String som;
	
	public Animal(String nome, int idade, String som) {
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSom(som);
	}
	
	//Métodos de classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	

	
	
	
	
	
}
