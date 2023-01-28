package atividades58;
/*Imprima todos os números de 150 a 300
 */
public class PrintNumbers {
	public static void main(String[] args) {
		
		int i = 150;
		
		while(i<=300) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n************************************");
		//outra forma de resolver
		
		for(i=150;i<=300;i++) {
			System.out.println(i);
		}
		
	}
}
