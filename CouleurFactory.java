public class CouleurFactory implements AbstractFactory{
	
		public Couleur getCouleur(String couleur){
			if(couleur==null){
				return null;
			}
			if(couleur.equalsIgnoreCase("Blanche")){
				return new Blanche();
			}
			else if(couleur.equalsIgnoreCase("Noire")){
				return new Noire();
			}
			
			return null;
		}

	public Animal getAnimal(String animal){
		return null;
	}
}
