import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Remy
 *
 */
public class Equipe {
	
	private int idE;
	private String nomE;
	private int budget;
	private ArrayList <Coureur> listC;
	
	public Equipe(String nomE, int budget)
	{
		this.nomE = nomE;
		this.budget = budget;
	}
	
	public String getNomE()
	{
		return this.nomE;
	}
	
	public int getBudget()
	{
		return this.budget;
	}
	
	public ArrayList<Coureur> getlistC()
	{
		return this.listC;
	}

}
