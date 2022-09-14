package P_Orientada_Objetos;

/* Crie uma classe cliente e apresente os atributos e métodos referentes esta 
 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto
 *  e apresente as informações deste objeto no console.
 */
public class Cliente {
	
	//Declaração dos atributos da classe
	private String nomeCompleto;
	private int telefone;
	private String endereco;
	private String bairro;
	private String cidade;
	private String email;
	private int codigoCliente;
	private int cartaoCredito;
	
	public Cliente(String nomeCompleto, int telefone, String endereco, String bairro, String cidade, String email, int codigoCliente, int cartaoCredito){
	
		//construtor
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.email = email;
		this.codigoCliente = codigoCliente;
		this.cartaoCredito = cartaoCredito;
		
	}
	
	//Métodos de classe

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	//criando a classe abaixo para imprimir as informações do cliente
	public void imprimirInfo() {
		System.out.println("Nome do cliente: "+nomeCompleto);
		System.out.println("Telefone: "+telefone);
		System.out.println("Endereço: "+endereco);
		System.out.println("Bairro: "+bairro);
		System.out.println("Cidade: "+cidade);
		System.out.println("E-mail: "+email);
		System.out.println("Código do Cliente: "+codigoCliente);
		System.out.println("Número do cartão de crédito: "+cartaoCredito);
	}
	
	
	
	
	
}
