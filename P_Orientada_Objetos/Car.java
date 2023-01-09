package P_Orientada_Objetos;

public class Car {
	
	private String nameOwner;
	private String model;
	private String licensePlate;
	private int year;

	public Car(String nameOwner, String model, String licensePlate, int year) {
		
		this.nameOwner = nameOwner;
		this.model = model;
		this.licensePlate = licensePlate;
		this.year = year;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("\n\tDados do veículo: \nProprietário: "+nameOwner+"\nModelo: "+model+
				"\nPlaca: "+licensePlate+"\nAno: "+year);
	}
	
	

}
