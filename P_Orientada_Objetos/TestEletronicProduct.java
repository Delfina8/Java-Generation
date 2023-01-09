package P_Orientada_Objetos;

public class TestEletronicProduct {

	public static void main(String[] args) {
		
		ElectronicProduct produto = new ElectronicProduct("Celular",12,"Azul",2022);
		produto.print();
		
		produto.setColor("Violeta");
		produto.print();
	}

}
