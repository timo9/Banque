
public class Compte {

	//Attributs privés
	private int num;
	private String nom;
	private float solde;
	private Client leClt;
	
	//Constructeur
	public Compte(int unNum, String unNom, float unSolde, Client unClient){
		this.num = unNum;
		this.nom = unNom;
		this.solde = unSolde;
		this.leClt = unClient;
	}

	public int getNum() {
		return num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getSolde() {
		return solde;
	}
	
	public Client getClient(){
		return(this.leClt);
	}

	public void crediter(float uneSomme){
		if(this.solde <= uneSomme){
			this.solde = 0;
		}
		else{
			this.solde -= uneSomme;
		}
	}
	
	public void debiter(float uneSomme){
		this.solde += uneSomme;
	}
	
	public String toString(){
		String chaine = "";
		chaine = "Num de compte : " + this.num ;
		chaine += "\n Nom : " + this.nom ;
		chaine += "\n Solde : " + this.solde + "€";
		chaine += "\n Client : " + this.leClt.toString();
		return(chaine);
	}
	

}
