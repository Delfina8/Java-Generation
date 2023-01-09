package P_Orientada_Objetos;

public class ElectronicProduct {
	
	private String productName;
	private int code;
	private String color;
	private int year;
	
	public ElectronicProduct (String productName,int code,String color,int year ){
		
		this.productName=productName;
		this.code=code;
		this.color=color;
		this.year=year;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("\nProduto: "+productName+"\nCódigo: "+code+"\nCor: "+color+
				"\nAno de fabricação: "+year);
	}

}
