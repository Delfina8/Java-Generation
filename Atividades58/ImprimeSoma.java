package atividades58;
/*Imprima a soma de 1 até 1000.
 */

public class ImprimeSoma {
	public static void main (String args[]) {
		
		int i = 1;
		int soma=0;
		
		while(i<=1000) {
			i=soma+i; //ou soma=soma+i
			i++;
			System.out.println(i);		
		}
		
	}
}
