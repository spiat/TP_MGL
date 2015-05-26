public class Expediteur{
	private String nom;
	
	public void post(String str){
		BoiteAuxLettres.stock(str);
		}
}
