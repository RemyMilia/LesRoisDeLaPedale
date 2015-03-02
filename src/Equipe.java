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
	
	public Equipe()
	{
		this.nomE = "vide";
		this.budget = 0;
	}
	
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
	
	public void addCoureur(Coureur c)
	{
		this.listC = new ArrayList<Coureur>();
		this.listC.add(c);
	}

	public String toString()
	{
		String str = "";
		str +=  this.nomE + " (" + this.budget + ")";
		return str;
	}
}
