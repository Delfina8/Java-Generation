package P_Orientada_Objetos;

public class Airplane {
	
	//attributes
	private String marca;
	private int modelo;
	private int capacidade;
	private String nomePiloto;
	
	//constructor
	public Airplane(String marca,int modelo, int capacidade, String nomePiloto){
		
		this.marca=marca;
		this.modelo=modelo;
		this.capacidade=capacidade;
		this.nomePiloto=nomePiloto;
	}
	//methods

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
	
	public void capacidade(){
		if (this.capacidade>500)
		{
			System.out.println("\nLimite máximo atingido");
		}
	}
	
	public void print() {
		System.out.println("\n\tDados do avião: \nMarca: "+marca+"\nModelo: "+modelo+"\nCapacidade: "+capacidade+
				"\nNome do Piloto: "+nomePiloto);
	}
	
	
		
	
		
}
