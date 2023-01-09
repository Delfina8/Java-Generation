package P_Orientada_Objetos;

public class CarTest {

	public static void main(String[] args) {
		
		Car carro = new Car("Joana","Toyota","XYV56",2022);
		Car carro1 = new Car("André","Fiat","XY675",2021);
		carro.print();
		carro1.print();
		
		System.out.println("\n***********Transferência de proprietário(a)*************");
		carro.setNameOwner("Carlos");
		carro.print();
		
		carro1.setLicensePlate("XY789");
		carro1.print();
	}

}
