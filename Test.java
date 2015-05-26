public class Test{

	public static void main(String[] args){
		AbstractFactory animFactory = new AnimalFactory();
		AbstractFactory coolFactory =  new CouleurFactory();
		Animal chat = animFactory.getAnimal("Chat");
		Animal chien = animFactory.getAnimal("Chien");
		Couleur noire = coolFactory.getCouleur("Noire");
		Couleur blanche = coolFactory.getCouleur("Blanche");
		
		chat.bruit();
		chien.bruit();
		noire.couleur();
		blanche.couleur();
	}
}
