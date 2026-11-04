package techstore;

public class Adresse {
	private String gouvernorat;
	private int codePostal;
	public Adresse(String gouv,int codeP) {
		this.gouvernorat=gouv;
		this.codePostal=codeP;
	}
	
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouv) {
		this.gouvernorat=gouv;
		
	}
	public int getCodePostal() {
		return codePostal;
		
	}
	public void setCodePostal(int codeP) {
		this.codePostal=codeP;
	}
	public String toString() {
		return "Adresse[gouvernorat="+this.gouvernorat+", codePostal="+this.codePostal;
		
	}
}
