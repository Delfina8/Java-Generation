package P_Orientada_Objetos;

public class animalTeste {

	public static void main(String[] args) {
		
		animalCachorro dog = new animalCachorro("Bolinha",1,"Latido","Correr");
		dog.imprimirInfo();
		
		animalCavalo horse = new animalCavalo("Stalion",2,"Relincho","Correr");
		horse.imprimirInfo();
		
		animalPreguica sloth = new animalPreguica("Preguiça",5,"Assobiar","Subir árvores");
		sloth.imprimirInfo();
	}

}
