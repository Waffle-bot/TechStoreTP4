package techstore;

public class Element {
	private Article article;
	private long quantite;
	
	
	public Element(Article article, long quantite) {
        this.article = article;
        setQuantite(quantite);
	}
	public Article getArticle() {
		return article;
	}
	public void setArticl(Article article) {
		this.article = article;
	}
	public long getQuantite() {
		return quantite;
	}
	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}
	public String getReferenceArticle() {
		return article.getReference();
		
	}
	
		
		
	
	public String getNomArticle() {
		return article.getNom();
		
	}
	public double getPrixArticle() {
		return article.getPrix();
		
	}
	public void setArticle(Article article) {
		this.article=article;
}
	public void incrementerQuantite(long q) {
		if (this.quantite<q){
			this.quantite=q;
			
		}
		
	}
	public void decrementerQuantite(long q) {
		if (this.quantite>q) {
			this.quantite=q;
		}
	}
	public void modifier(String nom, double prix, long quantite) {
		this.article=new Article(nom,prix);
		this.quantite=quantite;
	}
	public boolean equals(String reference) {
		return article.getReference().equals(reference);
				
		
	}
	public boolean equals(Article A) {
		return article.getReference().equals(A);
		
	}
	 public String toString() {
	        return "Element [article=" + article + ", quantite=" + quantite + "]";
	    }
	
	
}
