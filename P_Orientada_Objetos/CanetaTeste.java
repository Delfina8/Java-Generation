package P_Orientada_Objetos;

public class CanetaTeste {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = true;
		c1.modelo = "Bic";
		c1.carga = 80;
		c1.status();
		c1.rabiscar();
		System.out.println("/n----------------------------");
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.ponta = 0.3f;
		c2.tampada = false;
		c2.modelo = "Bic";
		c2.carga = 50;
		c2.status();
		c2.rabiscar();
	}

}
