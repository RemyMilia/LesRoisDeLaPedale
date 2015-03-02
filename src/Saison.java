import java.util.ArrayList;


/**
 * @author Remy
 *
 */
public class Saison {

	/**
	 * @param args
	 */
	public static void simulation(Course course, ArrayList<Equipe> arr)
	{
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
			int scoret = 0; 
			scoret = (course.getMt() - c.getMt()) + (course.getSp() - c.getSp()) + (course.getVa() - c.getVa());
			if(scoret < score)
			{
				score = scoret;
				vq = c;
			}
		}
		course.setVainqueur(vq);
		System.out.println("Victoire de " +  course.getVainqueur());
	}
	
	
	// Création des courses, des coureurs et des équipes et lancement de la saison;
	public static void main(String[] args) 
	{
		Equipe e1 = new Equipe("e1", 1000000);
		Equipe e2 = new Equipe("e2", 2000000);
	
		Coureur coureur1 = new Coureur(1, 9, 7, 8, e1);
		Coureur coureur2 = new Coureur(2, 4 , 4, 4, e2);
		
		e1.addCoureur(coureur1);
		e2.addCoureur(coureur2);
		
		Course course1 = new Course(1, "test", 9, 7, 8);
		
		ArrayList<Equipe> eq_to_subscribe = new ArrayList<Equipe>();
		eq_to_subscribe.add(e1);
		eq_to_subscribe.add(e2);
		
		simulation(course1,eq_to_subscribe);
				
	}

}
