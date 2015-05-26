public class AnimalFactory implements AbstractFactory{

	public Animal getAnimal(String animal){
		if(animal==null){
			return null;
			}
		if(animal.equalsIgnoreCase("Chat")){
			return new Chat();
			}
		else if(animal.equalsIgnoreCase("Chien")){
			return new Chien();
			}
			
			return null;
		}

	public Couleur getCouleur(String couleur){
		return null;
		}
}
