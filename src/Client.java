
public class Client {

	//Attributs privés
	private String nom;
	private String prenom;
	private String civilite;
	private String adresse;
	private String mail;
	private String tel;
	
	//Constructeur
	public Client(String unNom, String unPrenom, String uneCivilite, String uneAdresse, String unMail, String unTel){
		
		this.nom = unNom;
		this.prenom = unPrenom;
		this.civilite = uneCivilite;
		this.adresse = uneAdresse;
		this.mail = unMail;
		this.tel = unTel;
	}
	
	
	//commentaire pour test final de GIT graphique local et via GitHub
	//Attention...
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString(){
		String chaine = "";
		chaine += "\n Nom : " + this.nom ;
		chaine += "\n Prénom : " + this.prenom ;
		chaine += "\n Civilité : " + this.civilite ;
		chaine += "\n Adresse : " + this.adresse ;
		chaine += "\n Mail : " + this.mail ;
		chaine += "\n Téléphone : " + this.tel ;
		return(chaine);
	}

}
