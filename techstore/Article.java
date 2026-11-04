package techstore;

public class Article {
	private static int compteur = 0;
	private int id;
	private String nom;
	private String reference;
	private double prix;
	
	
	public Article(String nom, double prix) {
		
		this.id = ++compteur;
		this.nom = nom;
		this.reference = genereReference(nom ,id);
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static String genereReference(String nom,int id) {
		String debut;
		if(nom.length()>=3) {
			debut=nom.substring(0,3).toUpperCase();
		}else debut=nom.toUpperCase();
	return debut+id;
	}
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void modifier(String nom) {
        setNom(nom);
        this.reference=genereReference(nom,id);
    }
	public void modifier(String nom,double prix){
		this.nom=nom;
		this.prix=prix;
		this.reference=genereReference(nom,id);
	}
	
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", reference=" + reference + ", prix=" + prix + "]";
	}
	
	

}
