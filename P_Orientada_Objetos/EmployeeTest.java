package P_Orientada_Objetos;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] lista = new Employee[3];
		
		lista[0]=new Employee("Joa",3000);
		lista[1]=new Employee("Joana",2000);
		lista[2]=new Employee("Joana 2",1000);
		
		for(Employee roda:lista) { //for it //laço de repetição criado para rodar
			//a classe employee com uma variável de loop chamada roda e vai imprimir
			//as informações dos empregados da primeira posição até a última
			roda.print();
		}
		System.out.println("\n*******************************");
		
		for(Employee roda:lista) {
			roda.increaseSalary(20);
			roda.print();
		}
		
	
	
		
	}

}
