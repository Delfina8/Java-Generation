package P_Orientada_Objetos;

public class Caneta {
	//atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//métodos
	
	void status()
	{
		System.out.println("um modelo "+this.modelo);
		System.out.println("uma caneta "+this.cor);
		System.out.println("Ponta "+this.ponta);
		System.out.println("Carga "+this.carga);
		System.out.println("Está tampada "+this.tampada);
	}
	
	void rabiscar()
	{
		
		if (this.tampada==true) {
			System.out.println("ERRO! Não posso rabiscar");
			
		} else {
			System.out.println("Estou a rabiscar");
		}
			
	}
	
	void tampar()
	{
		this.tampada=true;
	}
	
	void destampar() {
		this.tampada=false;
	}
	
	

}
