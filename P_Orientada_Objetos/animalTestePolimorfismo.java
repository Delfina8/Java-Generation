package P_Orientada_Objetos;

public class animalTestePolimorfismo {

	public static void main(String[] args) {
		
		animalCachorroPolimorfismo dog = new animalCachorroPolimorfismo("Bolinha",1);
		dog.imprimirInfo();
		
		animalCavaloPolimorfismo horse = new animalCavaloPolimorfismo("Stalion",2);
		horse.imprimirInfo();
		
		animalPreguicaPolimorfismo sloth = new animalPreguicaPolimorfismo("Preguiça",5);
		sloth.imprimirInfo();
		
		animalPolimorfismo animalpolimorfismo = null;
		
		animalpolimorfismo = dog;
		dog.imprimirInfo();
		animalpolimorfismo.som("");
		animalpolimorfismo.acao("");
		
		animalpolimorfismo = horse;
		horse.imprimirInfo();
		animalpolimorfismo.som("");
		animalpolimorfismo.acao("");
		
		animalpolimorfismo = sloth;
		sloth.imprimirInfo();
		animalpolimorfismo.som("");
		animalpolimorfismo.acao("");

	}

}
