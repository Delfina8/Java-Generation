package P_Orientada_Objetos;
/*Crie uma classe funcionário e apresente os atributos e métodos referentes a
 * esta classe, em seguida crie um objeto funcionário, defina as instancias 
 * deste objeto e apresente as informações deste objeto no console.
 * 
 */
import java.text.NumberFormat;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee (String name, double salary) {
		
		this.setName(name);
		this.setSalary(salary);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentual) { //aumentar salário
		salary *= 1 + percentual/100;
	}
	
	public String formatCurrency() { //formatar moeda
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //pega a moeda padrão do país
		nf.setMinimumFractionDigits(2); //este método indica quantas casas decimais terei depois da vírgula
		String formatoCurrency = nf.format(salary); //formatar o salário
		return formatoCurrency;
	}
	
	public void print() {
		System.out.println("\nNome: "+name+"\t\tSalário: "+this.formatCurrency());
		
	}
	

}
