package techstore;
import java.util.ArrayList;

public class Stock {
	
	ArrayList <Element>articleList =new ArrayList<>();
	public Stock(){
		this.articleList=new ArrayList<Element>();	
	}
	public Stock(ArrayList<Element> articleList) {
		this.articleList=articleList;
	}
	public Stock(ArrayList<String> noms, ArrayList<Double> prix, ArrayList<Long> quantites) {
	    this();
	    for (int i = 0; i < noms.size(); i++) {
	        ajouteArticle(noms.get(i), prix.get(i), quantites.get(i));
	    }
	}
	public ArrayList<Element> getArticleList(){
		return articleList;
		}
	public int getArticleNB() {
		return articleList.size();
	}
	public void setArticleList(ArrayList<Element> articleList) {
		this.articleList=articleList;
	}
	public void ajouteArticle(Article article, long q) {
		articleList.add(new Element(article,q));
	}
	public void ajouteArticle(String nom,Double prix,Long q) {
		ajouteArticle(new Article(nom,prix),q);
		
	}
	public Element trouveArticle(String reference) {
		for(Element e:articleList) {
			if (e.equals(reference)) {
				return e;
			}
		}
		return null;
	}
	public boolean modifierArticle(String reference ,String nom,Double prix,Long q) {
		Element e=trouveArticle(reference);
		e.modifier(nom,prix,q);
		return false;
	}
	public boolean supprimerArticle(String reference ) {
		Element e= trouveArticle(reference);
		return articleList.remove(e);
	}
	public boolean incrementerQuantiteArticle(String reference ,long q) {
		Element e=trouveArticle(reference);
		e.incrementerQuantite(q);
		return false;
	}
	public void decrementerQuantiteArticle(String reference,long q) {
		Element e=trouveArticle(reference);
		e.decrementerQuantite(q);
	}

    @Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element e : articleList) {
            sb.append(e).append("\n");
        }
        return sb.toString();
		
	}
	
	

}
