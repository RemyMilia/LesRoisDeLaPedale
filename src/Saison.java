import java.util.ArrayList;


/**
 * @author Remy
 *
 */
public class Saison {

	/**
	 * @param args
	 */
	
	
	// Création des courses, des coureurs et des équipes et lancement de la saison;
	public static void main(String[] args) 
	{
		Equipe e1 = new Equipe("Movistar", 1000000);
		Equipe e2 = new Equipe("Trek",2000000);
		
		Coureur coureur1 = new Coureur(1, 9, 7, 8, e1);
		Coureur coureur2 = new Coureur(2, 7 , 5, 10,e2);
		
		
		
		
	}

}
