package techstore;

public class personne {
	private String cin;
	private String nom;
	private String prenom;
	private Adresse adresse;
	public personne(String cin, String nom, String prenom, Adresse adresse) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public personne(String cin, String nom, String prenom, String gouvernorat, int codeP) {
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		adresse=new Adresse(gouvernorat ,codeP);
	}
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

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



	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String toString() {
		return "personne [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
	

}


