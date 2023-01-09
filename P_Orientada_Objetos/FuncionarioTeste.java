package P_Orientada_Objetos;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario emp=new Funcionario("Juliana","Rua da Marola,99","77777777777",999666222,
				20,122,1500,30);
		
		emp.setNome("Ana");
		emp.setSalarioBase(3000);
		
		System.out.println(emp.getEndereco());
		System.out.println(emp.getNome());
		System.out.println(emp.getSalarioBase());
		
		emp.print();
		emp.calcularSalario();
		emp.validarCpf();
		
		

	}

}
