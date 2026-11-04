package techstore;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Test {
	private static void afficherMenu() {
		System.out.println("\n========== GESTION DU STOCK TECHSTORE ==========");
		System.out.println("0 - Ajouter un article");
		System.out.println("1 - Augmenter la quantité d'un article");
		System.out.println("2 - Modifier un article");
		System.out.println("3 - Supprimer un article");
		System.out.println("4 - Consulter le stock");
		System.out.println("5 - Quitter");
	}
 
	public static void main(String[] args) {
 
		ArrayList<String> noms = new ArrayList<String>();
		ArrayList<Double> prix = new ArrayList<Double>();
		ArrayList<Long> quantite = new ArrayList<Long>();
		noms.add("Apple iPad");                  prix.add(1269.0); quantite.add(8L);
		noms.add("Micro Casque 588 Filaire");    prix.add(59.0);   quantite.add(15L);
		noms.add("Souris Logitech M185");        prix.add(35.0);   quantite.add(20L);
		noms.add("Clavier Mecanique RGB");       prix.add(149.0);  quantite.add(10L);
 
		Stock stock = new Stock(noms, prix, quantite);
		Scanner sc = new Scanner(System.in);
 
		int choix;
		do {
			afficherMenu();
			System.out.print("Votre choix : ");
			choix = sc.nextInt();
 
			switch (choix) {
			case 0: {
				System.out.println("Nom de l'article :");
				sc.nextLine();                    
				String nom = sc.nextLine();       // le nom peut contenir des espaces
				System.out.println("Prix (TND) :");
				double price = sc.nextDouble();
				System.out.println("Quantité :");
				long q = sc.nextLong();
				stock.ajouteArticle(nom, price, q);
				System.out.println("Article ajouté avec succès.");
				break;
			}
			case 1: {
				System.out.println("Référence de l'article :");
				String ref = sc.next();
				System.out.println("Quantité à ajouter :");
				long q = sc.nextLong();
				if (stock.trouveArticle(ref) == null) {
					System.out.println("Article introuvable.");
				} else if (stock.incrementerQuantiteArticle(ref, q)) {
					System.out.println("Quantité augmentée avec succès.");
				} else {
					System.out.println("Quantité invalide.");
				}
				break;
			}
			case 2: {
				System.out.println("Référence de l'article à modifier :");
				String ref = sc.next();
				if (stock.trouveArticle(ref) == null) {
					System.out.println("Article introuvable.");
					break;
				}
				System.out.println("Nouveau nom :");
				sc.nextLine();                    // consomme le retour à la ligne
				String nom = sc.nextLine();
				System.out.println("Nouveau prix :");
				double price = sc.nextDouble();
				System.out.println("Nouvelle quantité :");
				long q = sc.nextLong();
				if (stock.modifierArticle(ref, nom, price, q)) {
					System.out.println("Article modifié avec succès.");
				} else {
					System.out.println("Données invalides.");
				}
				break;
			}
			case 3: {
				System.out.println("Référence de l'article à supprimer :");
				String ref = sc.next();
				if (stock.supprimerArticle(ref)) {
					System.out.println("Article supprimé avec succès.");
				} else {
					System.out.println("Article introuvable.");
				}
				break;
			}
			case 4: {
				if (stock.getArticleNB() == 0) {
					System.out.println("Le stock est vide.");
				} else {
					System.out.println("Stock (" + stock.getArticleNB() + " articles) :");
					System.out.print(stock);
				}
				break;
			}
			case 5: {
				System.out.println("Au revoir !");
				break;
			}
			default:
				System.out.println("Choix invalide.");
			}
 
		} while (choix != 5);
 
		sc.close();
	}
}
 