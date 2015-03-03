import java.util.ArrayList;
import java.util.Random;


/**
 * @author Remy
 *
 */
public class Saison {

	/**
	 * @param args
	 */
	private static Saison instance = null;
	private Saison(){}
	
	public static Saison getInstance(){
		if(instance == null)
		{
			instance = new Saison();
		}
		return instance;
	}
	
	public static int random(int high, int low) {
		return((int)(Math.random() * (high+1-low)) + low);
	}
	
	public void simulation(Course course, ArrayList<Equipe> arr, Originator og, CareTaker ct)
	{

		System.out.println("C'est parti pour " + course.getNomCourse() + "!");
		System.out.println("***AVANT-COURSE***");

		ArrayList<Coureur> participants = new ArrayList<Coureur>();
		for(Equipe e : arr)
		{
			for(Coureur c : e.getlistC())
			{
				participants.add(c);
			}
		}
		Coureur vq = new Coureur();
		int score = 50;
		for (Coureur c : participants)
		{
		    
			int alea = 0;
			int malus = 0;
			
			c.forme = random(5,0);
			og.setForme(c.forme);
			og.setCourse(course.getNomCourse());
			og.setCoureur(c.getNomCoureur());
			ct.add(og.saveFormeToMemento());
			
			if(c.forme > 4)
			{
				System.out.println(c.getNomCoureur() + " est plutôt en forme!");
			}
			else if(c.forme < 2)
			{
				System.out.println(c.getNomCoureur() + " n'est pas trop en forme!");
			}
			
			for(int i=0; i<3; ++i)
			{
				alea = random(10,0);
				switch (alea){
					case 2: 
						malus += 1; // crevaison
						c.crev++;
						break;
					case 5:
						malus += 1; // crevaison 
						c.crev++;
						break;
					case 7: 
						malus += 3; // chute
						c.chute++;
						break;
					case 10: 
						malus += 10; // chute synonyme de défaite ou abandon
						c.chute++;
						c.abandon = true;
						break;
				}
			}
						
			int scoret = c.forme + malus; 
			int sc_Sp = course.getSp() - c.getSp();
			int sc_Va = course.getVa() - c.getVa();
			int sc_Mt = course.getMt() - c.getMt();
			if(sc_Sp < 0) sc_Sp = 0;
			if(sc_Va < 0) sc_Va = 0;
			if(sc_Mt < 0) sc_Mt = 0;
			
			scoret += sc_Sp + sc_Va + sc_Mt;
			
			// le "score" le plus bas l'emporte
			if(scoret < score)
			{
				score = scoret;
				vq = c;
			}
		}
		course.setVainqueur(vq);
		System.out.println("VICTOIRE de " +  course.getVainqueur());
		System.out.println("***RESUME DES EVENTS DE LA COURSE***");
		for (Coureur c : participants)
		{
			c.getStatus();
			c.reset();
		}
		
		System.out.println("--------------------------");
	}
	
	
	// Création des courses, des coureurs et des équipes et lancement de la saison;
	public static void main(String[] args) 
	{
		
		Saison s = Saison.getInstance();
		
		Equipe e1 = new Equipe("Movistar Team");
		Equipe e2 = new Equipe("FDJ");
		Equipe e3 = new Equipe("Etix QuickStep");
		Equipe e4 = new Equipe("Katusha");
		Equipe e5 = new Equipe("Astana");
		
		Sponsor s1 = new Sponsor("sp", 1000000);
		
		e1.setSponsor(s1);
		e2.setSponsor(s1);
		e3.setSponsor(s1);
		e4.setSponsor(s1);
		e5.setSponsor(s1);

    
		Coureur coureur1 = new Coureur("A.Valverde", 5, 7, 6); // la somme des points <= 20! Max note sur attribut = 10!
		Coureur coureur2 = new Coureur("T.Pinot", 3, 5, 7);
		Coureur coureur3 = new Coureur("M.Cavendish", 10, 4, 1);
		Coureur coureur4 = new Coureur("Y.Kristoff", 9, 5, 2);
		Coureur coureur5 = new Coureur("V.Nibali", 5, 6, 8);
		
		
		e1.addCoureur(coureur1);
		e2.addCoureur(coureur2);
		e3.addCoureur(coureur3);
		e4.addCoureur(coureur4);
		e5.addCoureur(coureur5);

	    
		Course course1 = new Course(1, "LBL", 5, 10, 5);
		Course course2 = new Course(2, "MSR", 8, 8, 4);
		Course course3 = new Course(3, "FW", 4, 9, 7);
		Course course4 = new Course(4, "TF", 9, 4, 1);
		Course course5 = new Course(5, "TFG", 1, 5, 10);
		
		ArrayList<Equipe> eq_to_subscribe = new ArrayList<Equipe>();
		eq_to_subscribe.add(e1);
		eq_to_subscribe.add(e2);
		eq_to_subscribe.add(e3);
		eq_to_subscribe.add(e4);
		eq_to_subscribe.add(e5);
		

		// Préparation des mementos
		Originator og = new Originator();
	    CareTaker ct = new CareTaker();
	    

		s.simulation(course1,eq_to_subscribe, og, ct);	
		s.simulation(course2,eq_to_subscribe, og, ct);				
		s.simulation(course3,eq_to_subscribe, og, ct);				
		s.simulation(course4,eq_to_subscribe, og, ct);				
		s.simulation(course5,eq_to_subscribe, og, ct);	
	
		System.out.println();
		System.out.println();
		
		System.out.println("Résumé des formes des coureurs sur les courses:");
		for(int i = 0; i < ct.mementoList.size(); ++i)
		{
		
			System.out.println(ct.get(i).getCoureur() + " sur " + ct.get(i).getCourse() + ": " + ct.get(i).getState());
			
		}
	
	}
}
