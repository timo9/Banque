import java.util.ArrayList;


public class Banque {

	//Attributs privés
	private String nom;
	private ArrayList<Compte>listeComptes;
	
	//Constructeur
	public Banque(String unNom){
		this.nom = unNom;
		this.listeComptes = new ArrayList<Compte>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public ArrayList<Compte> getListeComptes() {
		return listeComptes;
	}

	public String voirCompte(Compte unCompte){
		String chaine = "";
		for(Compte leCompte : listeComptes){
			chaine += leCompte.toString();
		}
		return(chaine);
	}
	
	public void ajouterCompte(Compte unCompte){
		this.listeComptes.add(unCompte);
	}
	
	public void supprimerCompte(Compte unCompte){
		this.listeComptes.remove(unCompte);
	}
	
	public int getNbComptes(){
		return (this.listeComptes.size());
	}
	
}
